package ptit.d19cqcp02.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ptit.d19cqcp02.web.model.embeded.OrderDetailId;
import ptit.d19cqcp02.web.model.entity.OrderDetail;

import java.util.List;
import java.util.Optional;

@Repository
public interface IOrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId> {
    @Query(
            value = "select * " + "from orderdetails od" + " where od.order_id=?2 and od.product_id=?1",
            nativeQuery = true)
    OrderDetail findByProductIdAndOrderId(Long productId, Long orderId);


    Optional<OrderDetail> findById_Product_ProductIdAndId_Order_OrderId(Long productid, Long orderid);


    List<OrderDetail> findById_Order_OrderId(Long orderId);

}
