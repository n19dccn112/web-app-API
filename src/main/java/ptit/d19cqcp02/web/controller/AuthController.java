package ptit.d19cqcp02.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ptit.d19cqcp02.web.model.dto.ChangePassRequest;
import ptit.d19cqcp02.web.model.dto.LoginRequest;
import ptit.d19cqcp02.web.model.dto.SignupRequest;
import ptit.d19cqcp02.web.service.impl.UserDetailServiceImpl;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600) //cho phép http, get post..
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final UserDetailServiceImpl service;

    public AuthController(UserDetailServiceImpl service) {

        this.service = service;
    }

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

        return service.checkLogin(loginRequest);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {

        return service.register(signUpRequest);
    }

    @PostMapping("/changePass")
    public ResponseEntity<?> changePass(@Valid @RequestBody ChangePassRequest signUpRequest) {

        return service.changePass(signUpRequest);
    }
}
