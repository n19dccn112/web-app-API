package ptit.d19cqcp02.web.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ptit.d19cqcp02.web.model.entity.OrderStatus;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderStatusClass {
    Long id;
    OrderStatus orderStatus;
    BigDecimal amountOrderStatus;
}
