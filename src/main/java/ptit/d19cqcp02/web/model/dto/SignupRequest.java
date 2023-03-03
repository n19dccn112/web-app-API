package ptit.d19cqcp02.web.model.dto;

import lombok.Getter;
import lombok.Setter;
import ptit.d19cqcp02.web.model.RoleName;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class SignupRequest {
    private Long id;
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    private RoleName role;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
}
