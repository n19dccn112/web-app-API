package ptit.d19cqcp02.web.model.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Schema(name = "Category")
public class CateDTO {
    private Long cateId;
    @NotNull
    private String categoryName;
    private String description;
}
