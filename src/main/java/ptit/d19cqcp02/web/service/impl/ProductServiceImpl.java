package ptit.d19cqcp02.web.service.impl;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ptit.d19cqcp02.web.exception.NotFoundException;
import ptit.d19cqcp02.web.model.dto.ProductDTO;
import ptit.d19cqcp02.web.model.entity.Category;
import ptit.d19cqcp02.web.model.entity.Feature;
import ptit.d19cqcp02.web.model.entity.Product;
import ptit.d19cqcp02.web.repository.ICategoryRepository;
import ptit.d19cqcp02.web.repository.IFeatureRepository;
import ptit.d19cqcp02.web.repository.IImageRepository;
import ptit.d19cqcp02.web.repository.IProductRepository;
import ptit.d19cqcp02.web.service.IBaseService;
import ptit.d19cqcp02.web.service.IModelMapper;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements IBaseService<ProductDTO, Long>, IModelMapper<ProductDTO, Product> {
    private final IProductRepository repository;
    private final ModelMapper modelMapper;
    private final IFeatureRepository featureRepository;
    private final ICategoryRepository categoryRepository;
    private final IImageRepository imageRepository;

    private List<Feature> findAllFeature(Set<Long> featureIds) {
        return featureRepository.findAllByFeaturesId(featureIds);
    }


    public ProductDTO findById(Long id) {
        Optional<Product> entity = repository.findById(id);
        entity.orElseThrow(() -> new NotFoundException(Product.class, id));
        return createFromE(entity.get());
    }

    public ProductDTO update(Long id, ProductDTO productDTO) {
        Optional<Product> entity = repository.findById(id);

        entity.orElseThrow(() -> new NotFoundException(Product.class, id));
        entity.get().setProductUpDate(new Date());
        entity.get().setFeatures(findAllFeature(productDTO.getFeatureIds()));
        return createFromE(repository.save(updateEntity(entity.get(), productDTO)));
    }

    public ProductDTO save(ProductDTO productDTO) {
        Product entity = createFromD(productDTO);
        if (productDTO.getCreateDate() == null) {
            entity.setProductCreateDate(new Date());
        }
        return createFromE(repository.save(createFromD(productDTO)));
    }

    @Transactional
    public ProductDTO delete(Long id) {
        Optional<Product> entity = Optional.ofNullable(repository.findById(id)
                .orElseThrow(() -> new NotFoundException(Product.class, id)));
        imageRepository.deleteAllByProductId(id);
        featureRepository.deleteAllByProductId(id);
        repository.delete(entity.get());
        return createFromE(entity.get());
    }

    public Product createFromD(ProductDTO dto) {
        Product entity = modelMapper.map(dto, Product.class);
        entity.setFeatures(findAllFeature(dto.getFeatureIds()));
        return entity;
    }

    public ProductDTO createFromE(Product entity) {
        ProductDTO dto = modelMapper.map(entity, ProductDTO.class);
        dto.setCategoryName(entity.getCategory().getCategoryName());
        dto.setFeaturesName(entity.getFeatures().stream().map(Feature::getFeatureSpecific).collect(Collectors.joining(" ")));
        dto.setFeatureIds(entity.getFeatures().stream().map(Feature::getFeatureFeatureId).collect(Collectors.toSet()));
        dto.setFeatureTypes(entity.getFeatures().stream().map((e) -> e.getFeatureType().getFeatureTypeName()).collect(Collectors.toSet()));
        return dto;
    }

    public Product updateEntity(Product entity, ProductDTO dto) {
        if (entity != null && dto != null) {
            entity.setProductDescription(dto.getProductDescription());
            entity.setProductPrice(dto.getProductPrice());
            entity.setProductRemain(dto.getRemain());
            entity.setProductName(dto.getProductName());
            entity.setFeatures(findAllFeature(dto.getFeatureIds()));
            entity.setCategory(categoryRepository.findById(dto.getCategoryId())
                    .orElseThrow(() -> new NotFoundException(Category.class, dto.getCategoryId())));

        }

        return entity;
    }

    public List<ProductDTO> findAll(Long categoryId, Set<Long> featureIds) {

        return createFromEntities(repository.findAllByFilter(featureIds, categoryId));
    }


    public List<ProductDTO> findAll(Long categoryId) {

        return createFromEntities(repository.findAllByCategoryCateId(categoryId));


    }

    public List<ProductDTO> findAllBySetProducts(Set<Long> productIds) {
        return createFromEntities(repository.findAllByProductId(productIds));
    }

    public List<ProductDTO> findAll(Set<Long> featureIds) {
        return createFromEntities(repository.findAllByFeaturesId(featureIds));
    }

    public List<ProductDTO> findAll() {
        return createFromEntities(repository.findAll());
    }

    private void setImage(final List<Product> products) {
        for (Product product : products) {
            product.setImages(imageRepository.findAllByProductProductId(product.getProductId()));
        }
    }
}
