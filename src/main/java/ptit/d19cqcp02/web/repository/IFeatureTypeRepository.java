package ptit.d19cqcp02.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.d19cqcp02.web.model.entity.FeatureType;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Repository
public interface IFeatureTypeRepository extends JpaRepository<FeatureType, Long> {
    @Override
    @NotNull
    Optional<FeatureType> findById(Long s);

    @Override
    <S extends FeatureType> S save(S entity);

    @Override
    void delete(FeatureType entity);
}
