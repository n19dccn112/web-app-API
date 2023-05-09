package ptit.d19cqcp02.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.d19cqcp02.web.model.entity.Event;

import java.util.Optional;

@Repository
public interface IEventRepository extends JpaRepository<Event, Long> {
    @Override
    Optional<Event> findById(Long along);
}
