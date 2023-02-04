package ptit.d19cqcp02.web.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import ptit.d19cqcp02.web.model.entity.FeatureType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class FeatureDTO {
    private Long featureId;
    @NotNull
    @NotBlank
    private String featureTypeId;
    private String specific;
    @JsonIgnore
    private FeatureType featureType;
    private Integer point;

    public String getTypeName() {
        return featureType.getFeatureTypeName();
    }

    public String getTypeUnit() {
        return featureType.getFeatureTypeUnit();
    }
}
