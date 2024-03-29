package ptit.d19cqcp02.web.controller.impl;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ptit.d19cqcp02.web.model.dto.RateDTO;
import ptit.d19cqcp02.web.service.impl.RateServiceImpl;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping({"api/rates"})
@Tag(
        name = "Rate"
)
public class RateControllerImpl {//implements IBaseController<RateDTO, RateKey, RateServiceImpl> {
    @Resource
    @Getter
    private RateServiceImpl service;

    @GetMapping("")
    public List<RateDTO> getAll(@RequestParam(required = false) Long productId,
                                @RequestParam(required = false) Long userId) {
        if (productId != null)
            return getService().findAll(productId);
        else if (userId != null)
            return getService().findAllbyUserId(userId);
        else
            return getService().findAll();
    }

    @GetMapping("/{productId}-{userId}")
    public RateDTO get1(@PathVariable Long productId, @PathVariable Long userId) {
        return service.findById(productId, userId);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("/{productId}-{userId}")
    public RateDTO update(@PathVariable Long productId, @PathVariable Long userId, @RequestBody RateDTO dto) {
        dto.setUserId(userId);
        dto.setProductProductId(productId);
        return service.update(productId, userId, dto);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("/{productId}-{userId}")
    public RateDTO delete(@PathVariable Long productId, @PathVariable Long userId) {
        return service.delete(productId, userId);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public RateDTO insert(@Valid @RequestBody RateDTO d) {
        return getService().save(d);
    }
}

