package ptit.d19cqcp02.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.d19cqcp02.web.model.entity.UserDetail;

@Repository
public interface IUserDetailRepository extends JpaRepository<UserDetail, Long> {
    UserDetail findAllByUser_Id(Long userId);
}
