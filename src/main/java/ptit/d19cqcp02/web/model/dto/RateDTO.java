package ptit.d19cqcp02.web.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import ptit.d19cqcp02.web.model.entity.User;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class RateDTO {
    @NotNull
    @DecimalMin("0")
    @DecimalMax("5")
    private Integer ratePoint;
    private String rateComment;
    @NotNull
    private Long productProductId;
    @NotNull
    private Long userId;
    @JsonIgnore
    private User user;

    public String getUserName() {
        return user.getUsername();
    }

    public String getUserEmail() {
        return user.getEmail();
    }
}
