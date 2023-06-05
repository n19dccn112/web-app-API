package ptit.d19cqcp02.web.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ptit.d19cqcp02.web.exception.NotFoundException;
import ptit.d19cqcp02.web.model.dto.ImageDTO;
import ptit.d19cqcp02.web.model.entity.Image;
import ptit.d19cqcp02.web.model.entity.Product;
import ptit.d19cqcp02.web.repository.IImageRepository;
import ptit.d19cqcp02.web.repository.IProductRepository;
import ptit.d19cqcp02.web.service.IBaseService;
import ptit.d19cqcp02.web.service.IModelMapper;

import java.util.List;
import java.util.Optional;

@Service
public class ImageServiceImpl implements IBaseService<ImageDTO, Long>, IModelMapper<ImageDTO, Image> {
    private final IImageRepository repository;
    private final ModelMapper modelMapper;
    private final IProductRepository productRepository;

    public ImageServiceImpl(IImageRepository repository, ModelMapper modelMapper, IProductRepository productRepository) {
        this.repository = repository;
        this.modelMapper = modelMapper;
        this.productRepository = productRepository;
    }

    public List<ImageDTO> findAll() {
        return createFromEntities(repository.findAll());
    }

    public List<ImageDTO> findAll(Long productId) {
        return createFromEntities(repository.findAllByProductProductId(productId));
    }

    public ImageDTO findById(Long imageId) {
        return createFromE(repository.findById(imageId).get());
    }


    public ImageDTO save(ImageDTO dto) {
        return createFromE(repository.save(createFromD(dto)));
    }

    public void save(Product product) {
        productRepository.save(product);
    }

    public ImageDTO delete(Long id) {
        Optional<Image> entity = Optional.ofNullable(repository.findById(id)
                .orElseThrow(() -> new NotFoundException(Image.class, id)));
        repository.delete(entity.get());
        return createFromE(entity.get());
    }

    public ImageDTO update(Long id, ImageDTO dto) {
        Optional<Image> entity = repository.findById(id);
        entity.orElseThrow(() -> new NotFoundException(Image.class, id));
        return createFromE(repository.save(updateEntity(entity.get(), dto)));
    }

    public Image createFromD(ImageDTO dto) {
        Image entity = modelMapper.map(dto, Image.class);
        entity.setProduct(productRepository.findById(dto.getProductId()).get());
        return entity;
    }

    public ImageDTO createFromE(Image entity) {
        ImageDTO dto = modelMapper.map(entity, ImageDTO.class);
        dto.setProductId(entity.getProduct().getProductId());
        return dto;
    }

    public Image updateEntity(Image entity, ImageDTO dto) {
        if (entity != null && dto != null) {
            entity.setImageAlt(dto.getImageAlt());
            entity.setImageHeight(dto.getImageHeight());
            //entity.setId(dto.getId());
            entity.setProduct(productRepository.findById(dto.getProductId())
                    .orElseThrow(() -> new NotFoundException(Product.class, dto.getProductId())));
            entity.setImageUrl(dto.getImageUrl());
            entity.setImageWidth(dto.getImageWidth());

        }

        return entity;
    }


}
