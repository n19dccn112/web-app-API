package ptit.d19cqcp02.web.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ptit.d19cqcp02.web.exception.NotFoundException;
import ptit.d19cqcp02.web.model.RoleName;
import ptit.d19cqcp02.web.model.dto.*;
import ptit.d19cqcp02.web.model.entity.Role;
import ptit.d19cqcp02.web.model.entity.User;
import ptit.d19cqcp02.web.model.entity.UserDetail;
import ptit.d19cqcp02.web.repository.IRoleRepository;
import ptit.d19cqcp02.web.repository.IUserDetailRepository;
import ptit.d19cqcp02.web.repository.IUserRepository;
import ptit.d19cqcp02.web.security.jwt.JwtUtils;
import ptit.d19cqcp02.web.security.services.UserDetailsImpl;
import ptit.d19cqcp02.web.service.IBaseService;
import ptit.d19cqcp02.web.service.IModelMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserDetailServiceImpl implements IBaseService<UserDetailDTO, Long>, IModelMapper<UserDetailDTO, User> {
  final private AuthenticationManager authenticationManager;
  final private IRoleRepository roleRepository;
  final private PasswordEncoder encoder;
  final private JwtUtils jwtUtils;
  private final IUserRepository repository;
  private final ModelMapper modelMapper;
  private final IUserDetailRepository userDetailRepository;

  public UserDetailServiceImpl(AuthenticationManager authenticationManager, IRoleRepository roleRepository, PasswordEncoder encoder, JwtUtils jwtUtils, IUserRepository repository, ModelMapper modelMapper, IUserDetailRepository userDetailRepository) {
    this.authenticationManager = authenticationManager;
    this.roleRepository = roleRepository;
    this.encoder = encoder;
    this.jwtUtils = jwtUtils;
    this.repository = repository;
    this.modelMapper = modelMapper;
    this.userDetailRepository = userDetailRepository;
  }

  public ResponseEntity<?> checkLogin(LoginRequest loginRequest) {
    Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

    // if go there, the user/password is correct
    SecurityContextHolder.getContext().setAuthentication(authentication);
    // generate jwt to return to client
    String jwt = jwtUtils.generateJwtToken(authentication);

    UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
    List<String> roles = userDetails.getAuthorities().stream()
            .map(item -> item.getAuthority())
            .collect(Collectors.toList());
    UserDetail entity = this.getDetail(userDetails.getId());
    return ResponseEntity.ok(new JwtResponse(jwt,
            userDetails.getId(),
            userDetails.getUsername(),
            userDetails.getEmail(),
            roles, entity.getFirstName() + " " + entity.getLastName()));
  }

  public ResponseEntity<?> changePass(ChangePassRequest request) {
    if (!repository.existsByUsername(request.getUsername())) {
      return ResponseEntity
              .badRequest()
              .body(new MessageResponse("Error: Username not found!"));
    }
    User user = repository.findByUsername(request.getUsername()).get();
    System.out.println(user.getPassword());
    System.out.println(encoder.encode(request.getOldPassword()));
    if (!encoder.matches(request.getOldPassword(), user.getPassword()))
      throw new NotFoundException("Username and old password not match");
    user.setPassword(encoder.encode(request.getPassword()));
    repository.save(user);
    return ResponseEntity.ok(new MessageResponse("Change password successfully!"));
  }

  public ResponseEntity<?> changePassByEmail(ChangePassByEmailRequest request) {
    if (!repository.existsByEmail(request.getEmail())) {
      return ResponseEntity
              .badRequest()
              .body(new MessageResponse("Error: Email not found!"));
    }
    User user = repository.findByEmail(request.getEmail()).get();
    user.setPassword(encoder.encode(request.getPassword()));
    repository.save(user);
    return ResponseEntity.ok(new MessageResponse("Change password successfully!"));
  }

  public ResponseEntity<?> register(SignupRequest signUpRequest) {
    if (repository.existsByUsername(signUpRequest.getUsername())) {
      return ResponseEntity.badRequest().body(new MessageResponse("Error: Username is already taken!"));
    }
    if (repository.existsByEmail(signUpRequest.getEmail())) {
      return ResponseEntity.badRequest().body(new MessageResponse("Error: Email is already in use!"));
    }

    // Create new user's account
    Optional<UserDetailDTO> dto = Optional.ofNullable(modelMapper.map(
            signUpRequest, UserDetailDTO.class));
    dto.get().setRole(signUpRequest.getRole());
    save(dto.orElseThrow(() -> new NotFoundException(UserDetailDTO.class, "null")));
    return new ResponseEntity<>(new MessageResponse("User registered successfully!"), HttpStatus.CREATED);
  }

  private Role getRole(String strRole) {
    Role role = new Role();
    if (strRole == null || strRole.equals("")) {
      Role userRole = roleRepository.findByName(RoleName.ROLE_USER)
              .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
      role = userRole;
    } else {
//      strRoles.forEach(role -> {
      switch (strRole.toLowerCase()) {
        case "admin":
          Role adminRole = roleRepository.findByName(RoleName.ROLE_ADMIN)
                  .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
          role = adminRole;

          break;
        case "pm":
          Role modRole = roleRepository.findByName(RoleName.ROLE_USER)
                  .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
          role = modRole;

          break;
        default:
          Role userRole = roleRepository.findByName(RoleName.ROLE_USER)
                  .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
          role = userRole;
      }
//      });
    }
    return role;
  }

  private UserDetail getDetail(Long id) {
    UserDetail detail = userDetailRepository.findById(id)
            .orElse(new UserDetail(1L, "", "", "", null));
    return detail;
  }

  @Override
  public List<UserDetailDTO> findAll() {
    return createFromEntities(repository.findAll());
  }

  public List<UserDetailDTO> findAllByProduct() {
    return createFromEntities(repository.findAll());
  }

  @Override
  public UserDetailDTO findById(Long id) {
    User entity = repository.findById(id).orElseThrow(() -> new NotFoundException(User.class, id));

    return createFromE(entity);
  }

  @Override
  public UserDetailDTO update(Long id, UserDetailDTO signupRequest) {
    User entity = repository.findById(id).orElseThrow(() -> new NotFoundException(User.class, id));
    entity = updateEntity(entity, signupRequest);
    saveDetail(entity, signupRequest);
    return createFromE(repository.save(entity));
  }

  private void updateDetail(UserDetailDTO signUpRequest) {

    User entity = repository.findByUsername(signUpRequest.getUsername())
            .orElseThrow(() -> new NotFoundException("Username =" + signUpRequest.getUsername() + " not found!"));
    saveDetail(entity, signUpRequest);
  }

  private void saveDetail(User entity, UserDetailDTO signUpRequest) {
    UserDetail userDetail = new UserDetail(entity.getId()
            , signUpRequest.getFirstName() == null ? signUpRequest.getUsername() : signUpRequest.getFirstName()
            , signUpRequest.getLastName() == null ? signUpRequest.getUsername() : signUpRequest.getLastName()
            , signUpRequest.getAddress() == null ? "" : signUpRequest.getAddress(), entity);
    userDetailRepository.save(userDetail);
  }

  @Override
  public UserDetailDTO save(UserDetailDTO dto) {
    User entity = createFromD(dto);
    entity.setRole(roleRepository.findByName(dto.getRole()).orElseThrow(() -> new NotFoundException(User.class, dto.getId())));
    repository.save(entity);
    updateDetail(dto);
    return createFromE(entity);
  }

  @Transactional
  @Override
  public UserDetailDTO delete(Long id) {
    Optional<User> entity = Optional.ofNullable(repository.findById(id)
            .orElseThrow(() -> new NotFoundException(User.class, id)));
    userDetailRepository.delete(getDetail(id));
    repository.delete(entity.get());

    return createFromE(entity.get());

  }

  @Override
  public User createFromD(UserDetailDTO dto) {
    User user = modelMapper.map(dto, User.class);
    user.setRole(getRole(dto.getRole().name()));

    user.setPassword(encoder.encode(dto.getPassword()));
    return user;
  }

  @Override
  public UserDetailDTO createFromE(User entity) {
    UserDetailDTO dto = modelMapper.map(entity, UserDetailDTO.class);
    UserDetail detail = this.getDetail(entity.getId());
    dto.setAddress(detail.getAddress());
    dto.setRole(entity.getRole().getName());
    dto.setFirstName(detail.getFirstName());
    dto.setLastName(detail.getLastName());
    dto.setPassword("");
    return dto;
  }

  @Override
  public User updateEntity(User entity, UserDetailDTO dto) {
    if (entity != null && dto != null) {
      entity.setRole(roleRepository.findByName(dto.getRole()).orElseThrow(() -> new NotFoundException(User.class, dto.getId())));
      if (dto.getPassword() != null)
        entity.setPassword(encoder.encode(dto.getPassword()));
      if (dto.getUsername() != null)
        entity.setUsername(dto.getUsername());
      entity.setEmail(dto.getEmail());
    }
    return entity;
  }
}
