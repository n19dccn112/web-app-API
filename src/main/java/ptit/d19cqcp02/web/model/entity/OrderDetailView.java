package ptit.d19cqcp02.web.model.entity;

import java.math.BigDecimal;

public interface OrderDetailView {
    Long getOrderId();

    String getFirstName();

    String getStatus();

    String getUsername();

    String getEmail();

    String getLastName();

    String getUAddress();

    String getAddress();

    String getPhone();

    Integer getAmount();

    Long getProductId();

    String getName();

    BigDecimal getPrice();

    Long getRemain();

    String getUrl();
}
