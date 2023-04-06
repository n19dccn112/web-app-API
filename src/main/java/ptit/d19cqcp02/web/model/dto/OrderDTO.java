package ptit.d19cqcp02.web.model.dto;

import lombok.Getter;
import lombok.Setter;
import ptit.d19cqcp02.web.model.entity.OrderStatus;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Map;

@Setter
@Getter
public class OrderDTO {
    private Long orderId;
    @NotNull
    private Long userId;

    //    private String orderTime;
    private String orderPhone;
    @NotNull
    private String orderAddress;

    private OrderStatus orderStatus;
    private Date orderTime;
    @NotNull
    private Map<Long, Integer> orderDetails; //prodcutid và amount
}
