package ptit.d19cqcp02.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ptit.d19cqcp02.web.model.entity.Image;

import java.util.List;

@Repository
public interface IImageRepository extends JpaRepository<Image, Long> {
    List<Image> findAllByProductProductId(Long productId);

    @Modifying
    @Query(value = "DELETE FROM image fd where fd.product_id=?1", nativeQuery = true)
    void deleteAllByProductId(Long productId);
}
