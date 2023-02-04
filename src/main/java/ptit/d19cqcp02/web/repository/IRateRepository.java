package ptit.d19cqcp02.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.d19cqcp02.web.model.entity.Rate;

import java.util.List;
import java.util.Optional;

@Repository
public interface IRateRepository extends JpaRepository<Rate, Long> {
    List<Rate> findAllById_ProductProductId(Long productId);

    Optional<Rate> findById_Product_ProductIdAndId_User_Id(Long productId, Long userId);

    List<Rate> findAllById_Product_ProductIdOrderByRatePoint(Long productId);
}
