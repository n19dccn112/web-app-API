package ptit.d19cqcp02.web.controller.impl;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ptit.d19cqcp02.web.controller.IBaseController;
import ptit.d19cqcp02.web.controller.IGetController;
import ptit.d19cqcp02.web.model.dto.FeatureTypeDTO;
import ptit.d19cqcp02.web.service.impl.FeatureTypeServiceImpl;

import javax.annotation.Resource;

@CrossOrigin("*")
@RestController
@RequestMapping({"api/featureTypes"})
@Tag(
        name = "FeatureType"
)
public class FeatureTypeControllerImpl implements IBaseController<FeatureTypeDTO, String, FeatureTypeServiceImpl>
        , IGetController<FeatureTypeDTO, String, FeatureTypeServiceImpl> {
    @Resource
    @Getter
    private FeatureTypeServiceImpl service;

}
