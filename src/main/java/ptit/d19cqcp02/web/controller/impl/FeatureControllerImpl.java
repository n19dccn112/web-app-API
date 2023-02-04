package ptit.d19cqcp02.web.controller.impl;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;
import ptit.d19cqcp02.web.controller.IBaseController;
import ptit.d19cqcp02.web.model.dto.FeatureDTO;
import ptit.d19cqcp02.web.service.impl.FeatureServiceImpl;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/features")
@Tag(name = "Features")
public class FeatureControllerImpl implements IBaseController<FeatureDTO, Long, FeatureServiceImpl> {
    @Resource
    @Getter
    private FeatureServiceImpl service;


    @GetMapping("")
    public List<FeatureDTO> getAll(@RequestParam(required = false) String featureType, @RequestParam(required = false) Long productId) {
        if (featureType != null)
            return getService().findAll(featureType);

        if (productId != null)
            return getService().findAll(productId);

        return getService().findAll();
    }

}