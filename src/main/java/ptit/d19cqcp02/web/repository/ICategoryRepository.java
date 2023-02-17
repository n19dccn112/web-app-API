package ptit.d19cqcp02.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.d19cqcp02.web.model.entity.Category;

import java.util.Optional;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
    @Override
    Optional<Category> findById(Long along);
}
