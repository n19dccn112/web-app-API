package ptit.d19cqcp02.web.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ImageDTO {
    private Long imageId;
    @NotNull
    private String imageUrl;
    private String imageAlt;
    @DecimalMin(value = "0")
    private Integer imageWidth;
    @DecimalMin(value = "0")
    private Integer imageHeight;
    @NotNull
    private Long productId;
}
