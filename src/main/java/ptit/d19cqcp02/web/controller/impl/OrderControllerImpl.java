package ptit.d19cqcp02.web.controller.impl;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;
import ptit.d19cqcp02.web.controller.IBaseController;
import ptit.d19cqcp02.web.model.dto.OrderDTO;
import ptit.d19cqcp02.web.service.impl.OrderServiceImpl;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/orders")
@Tag(
        name = "Orders"
)
public class OrderControllerImpl implements IBaseController<OrderDTO, Long, OrderServiceImpl> {
    @Resource
    @Getter
    private OrderServiceImpl service;

    @GetMapping("")
    public List<OrderDTO> getAll(@RequestParam(required = false) Long userId) {
        if (userId == null)
            return getService().findAll();
        else
            return getService().findAll(userId);
    }
}

