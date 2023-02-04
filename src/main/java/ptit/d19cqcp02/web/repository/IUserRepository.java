package ptit.d19cqcp02.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ptit.d19cqcp02.web.model.entity.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    @Query(
            value =
                    "SELECT u.* from username u join rates r on u.id = r.user_id"
                            + " where r.product_id = :productId",
            nativeQuery = true)
    List<User> findAllByProductId(@Param(value = "productId") Long productId);
}
