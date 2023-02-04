package ptit.d19cqcp02.web.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ptit.d19cqcp02.web.exception.EntityPrimaryKeyExistsException;
import ptit.d19cqcp02.web.exception.NotFoundException;
import ptit.d19cqcp02.web.model.dto.RateDTO;
import ptit.d19cqcp02.web.model.embeded.RateId;
import ptit.d19cqcp02.web.model.entity.Product;
import ptit.d19cqcp02.web.model.entity.Rate;
import ptit.d19cqcp02.web.model.entity.User;
import ptit.d19cqcp02.web.repository.IProductRepository;
import ptit.d19cqcp02.web.repository.IRateRepository;
import ptit.d19cqcp02.web.repository.IUserRepository;
import ptit.d19cqcp02.web.service.IBaseService;
import ptit.d19cqcp02.web.service.IModelMapper;

import java.util.List;
import java.util.Optional;

@Service
public class RateServiceImpl implements IBaseService<RateDTO, RateId>, IModelMapper<RateDTO, Rate> {
    private final IRateRepository repository;
    private final ModelMapper modelMapper;
    private final IProductRepository productRepository;
    private final IUserRepository userRepository;

    public RateServiceImpl(IRateRepository repository, ModelMapper modelMapper, IProductRepository productRepository, IUserRepository userRepository) {
        this.repository = repository;
        this.modelMapper = modelMapper;
        this.productRepository = productRepository;
        this.userRepository = userRepository;
    }

    public List<RateDTO> findAll() {
        return createFromEntities(repository.findAll());
    }

    public RateDTO findById(RateId rateId) {
//        Optional<Rate> entity = repository.findById(rateKey);
//        entity.orElseThrow(()-> new NotFoundException(FeatureType.class,rateKey.getProduct().getProductid()));
//        return createFromE(entity.get());
        return null;
    }

    public RateDTO update(RateId rateId, RateDTO rateDTO) {
//        Optional<Rate> entity = repository.findById(rateKey);
//        entity.orElseThrow(()-> new NotFoundException(FeatureType.class,rateKey.getProduct().getProductid()));
//        return createFromE(repository.save(updateEntity(entity.get(),rateDTO)));
        return null;
    }

    public RateDTO save(RateDTO rateDTO) {
        Optional<Rate> entity = repository.findById_Product_ProductIdAndId_User_Id(rateDTO.getProductId(), rateDTO.getUserId());
        if (entity.isPresent())
            throw new EntityPrimaryKeyExistsException(Rate.class, rateDTO.getProductId() + "-" + rateDTO.getUserId());
        //entity.get().setKey(findKey(rateDTO));
        return createFromE(repository.save(createFromD(rateDTO)));
    }

    public RateDTO delete(RateId rateId) {
//        Optional<Rate> entity = Optional.ofNullable(repository.findById(rateKey)
//                .orElseThrow(() -> new NotFoundException(Feature.class, rateKey.getProduct().getProductid())));
//        repository.delete(entity.get());
//        return createFromE(entity.get());
        return null;
    }

    public Rate createFromD(RateDTO dto) {
        Rate entity = modelMapper.map(dto, Rate.class);
        entity.setId(findId(dto));
        return entity;
    }

    public RateDTO createFromE(Rate entity) {
        RateDTO dto = modelMapper.map(entity, RateDTO.class);
        dto.setUser(entity.getId().getUser());
        dto.setProductId(entity.getId().getProduct().getProductId());
        dto.setUserId(entity.getId().getUser().getId());
        return dto;
    }

    public Rate updateEntity(Rate entity, RateDTO dto) {
        if (entity != null && dto != null) {
            entity.setRateComment(dto.getComment());
            entity.setRatePoint(dto.getPoint());
        }
        return entity;
    }

    private RateId findId(RateDTO dto) {
        return findId(dto.getProductId(), dto.getUserId());
    }

    public RateDTO findById(Long productId, Long userId) {
        Optional<Rate> entity = Optional.ofNullable(repository.findById_Product_ProductIdAndId_User_Id(productId, userId)
                .orElseThrow(() -> new NotFoundException(Rate.class, productId + "-" + userId)));
        return createFromE(entity.get());
    }

    private RateId findId(Long productId, Long userId) {
        Optional<User> user = Optional.ofNullable(userRepository.findById(userId)
                .orElseThrow(() -> new NotFoundException(User.class, userId)));
        Optional<Product> product = Optional.ofNullable(productRepository.findById(productId)
                .orElseThrow(() -> new NotFoundException(Product.class, productId)));
        return new RateId(product.get(), user.get());
    }

    public RateDTO update(Long productId, Long userId, RateDTO dto) {
        Optional<Rate> entity = Optional.ofNullable(repository.findById_Product_ProductIdAndId_User_Id(productId, userId)
                .orElseThrow(() -> new NotFoundException(Rate.class, productId + "-" + userId)));
        entity.get().setId(findId(dto));
        return createFromE(repository.save(updateEntity(entity.get(), dto)));
    }

    public RateDTO delete(Long productId, Long userId) {
        Optional<Rate> entity = Optional.ofNullable(repository.findById_Product_ProductIdAndId_User_Id(productId, userId)
                .orElseThrow(() -> new NotFoundException(Rate.class, productId + "-" + userId)));
        repository.delete(entity.get());
        return createFromE(entity.get());
    }

    public List<RateDTO> findAll(Long productId) {
        return createFromEntities(repository.findAllById_Product_ProductIdOrderByRatePoint(productId));
    }

}
