package ptit.d19cqcp02.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ptit.d19cqcp02.web.model.entity.Feature;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface IFeatureRepository extends JpaRepository<Feature, Long> {
    @Override
    Optional<Feature> findById(Long aLong);

    List<Feature> findAllByFeatureType_FeatureTypeId(Long featureTypeId);

    @Query(value = "SELECT * from features f where  f.feature_id in ?1", nativeQuery = true)
    List<Feature> findAllByFeaturesId(Set<Long> featureIds);

    @Query(value = "SELECT f.* from feature_detail fd join features f on f.feature_id = fd.feature_id"
            + " join featuretype ft on ft.id = f.feature_type_id where fd.product_id = ?1",
            nativeQuery = true)
    List<Feature> findAllByProductId(Long productId);

    @Modifying
    @Query(value = "DELETE FROM feature_detail fd where fd.product_id=?1", nativeQuery = true)
    void deleteAllByProductId(Long productId);
}
