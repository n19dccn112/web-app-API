package ptit.d19cqcp02.web.controller.impl;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;
import ptit.d19cqcp02.web.model.entity.OrderDetailView;
import ptit.d19cqcp02.web.service.impl.OrderServiceImpl;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/orderDetailViews")
@Tag(
        name = "OrderDetailViews"
)
public class OrderDetailViewControllerImpl {
    @Resource
    @Getter
    private OrderServiceImpl service;

    @GetMapping("")
    public List<OrderDetailView> getAll(@RequestParam(required = true) Long userId) {
        if (userId == null)
            return getService().findAllView(userId);
        else
            return getService().findAllView(userId);
    }
}
