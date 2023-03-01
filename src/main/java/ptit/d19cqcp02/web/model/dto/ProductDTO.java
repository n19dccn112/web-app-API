package ptit.d19cqcp02.web.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Setter
@Getter
public class ProductDTO {
    private Long productId;
    @DecimalMin(value = "1")
    private BigDecimal productPrice;
    @NotNull
    @NotBlank
    private String productName;

    private String productDescription;

    @NotNull
    private Long categoryId;


    private String categoryName;
    @JsonIgnore
    private String featuresName;


    private Date createDate;
    @NotNull
    @DecimalMin("0")
    private Integer remain;

    private Date productUpDate;
    private Set<Long> featureIds;
    @JsonIgnore
    private Set<String> featureTypes;
}
