package ptit.d19cqcp02.web.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtResponse {
    private String token;


    @JsonIgnore
    private String type = "Bearer";
    private Long id;
    private String username;
    private String email;
    private String fullName;
    //@JsonIgnore
    private String role;

    public JwtResponse() {
    }

    public JwtResponse(String accessToken, Long id, String username, String email, String role) {

        this.id = id;
        this.username = username;
        this.email = email;
        this.role = role;
        this.token = accessToken;
    }

    public JwtResponse(String accessToken, Long id, String username, String email, String role, String fullName) {

        this.id = id;
        this.username = username;
        this.email = email;
        this.role = role;
        this.token = accessToken;
        this.fullName = fullName;
    }
}
