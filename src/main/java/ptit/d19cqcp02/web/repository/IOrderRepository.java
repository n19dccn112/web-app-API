package ptit.d19cqcp02.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ptit.d19cqcp02.web.model.entity.Order;
import ptit.d19cqcp02.web.model.entity.OrderDetailView;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface IOrderRepository extends JpaRepository<Order, Long> {
    @Query(
            value =
                    "select o.orderId as orderId, o.status as status, u.username as username, ud.first_name as firstName, ud.last_name as lastName, ud.address as uAddress, o.address as address,"
                            + " o.phone as phone, od.amount as amount, p.id as productId, p.name as name, p.price as price, p.remain as remain,"
                            + " (select top(1) i.url from image i where i.product_id=p.id) as url"
                            + " from username u left join orders o on u.id=o.user_id"
                            + " join orderdetails od on o.orderid=od.order_id"
                            + " join products p on od.product_id=p.id"
                            + " join userdetails ud on u.id=ud.id"
                            + " where u.id=?1",
            nativeQuery = true)
    List<OrderDetailView> getAllOrderByUserId(Long userI);

    @Override
    Optional<Order> findById(Long aLong);

    Optional<Order> findByOrderTime(Date date);


    List<Order> findByUser_Id(Long userId);
}
