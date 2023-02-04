package ptit.d19cqcp02.web.controller.impl;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;
import ptit.d19cqcp02.web.controller.IBaseController;
import ptit.d19cqcp02.web.model.dto.ImageDTO;
import ptit.d19cqcp02.web.service.impl.ImageServiceImpl;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping({"api/images"})
@Tag(
        name = "Image"
)
public class ImageControllerImpl implements IBaseController<ImageDTO, Long, ImageServiceImpl> {
    @Resource
    @Getter
    private ImageServiceImpl service;

    @GetMapping("")
    public List<ImageDTO> getAll(@RequestParam(required = false) Long productId) {
        if (productId != null)
            return getService().findAll(productId);
        else
            return getService().findAll();
    }
}
