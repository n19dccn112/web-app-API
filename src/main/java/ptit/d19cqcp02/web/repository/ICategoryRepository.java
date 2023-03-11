package ptit.d19cqcp02.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ptit.d19cqcp02.web.model.entity.Category;
import ptit.d19cqcp02.web.model.entity.Product;

import java.util.List;
import java.util.Optional;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
    @Override
    Optional<Category> findById(Long along);

    @Query(value = "select * from products where products.category_id=?1", nativeQuery = true)
    List<Product> findAllProductByCate(Long cateId);
}
