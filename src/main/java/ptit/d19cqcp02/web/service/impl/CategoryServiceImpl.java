package ptit.d19cqcp02.web.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ptit.d19cqcp02.web.exception.NotFoundException;
import ptit.d19cqcp02.web.model.dto.CateDTO;
import ptit.d19cqcp02.web.model.entity.Category;
import ptit.d19cqcp02.web.repository.ICategoryRepository;
import ptit.d19cqcp02.web.service.IBaseService;
import ptit.d19cqcp02.web.service.IModelMapper;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements IBaseService<CateDTO, Long>, IModelMapper<CateDTO, Category> {

    private final ICategoryRepository repository;
    private final ModelMapper modelMapper;

    public CategoryServiceImpl(ICategoryRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<CateDTO> findAll() {
        return createFromEntities(repository.findAll());
    }


    @Override
    public CateDTO findById(Long id) {
        Optional<Category> cate = repository.findById(id);
        cate.orElseThrow(() -> new NotFoundException(Category.class, id));
        return createFromE(cate.get());
    }

    @Override
    public CateDTO update(Long id, CateDTO dto) {
        Optional<Category> entity = repository.findById(id);
        entity.orElseThrow(() -> new NotFoundException(Category.class, id));
        return createFromE(repository.save(updateEntity(entity.get(), dto)));
    }

    @Override
    public CateDTO save(CateDTO entity) {
        return createFromE(repository.save(createFromD(entity)));
    }

    @Override
    public CateDTO delete(Long id) {
        Optional<Category> category = Optional.ofNullable(repository.findById(id)
                .orElseThrow(() -> new NotFoundException(Category.class, id)));
        repository.delete(category.get());
        return createFromE(category.get());
    }

    @Override
    public Category createFromD(CateDTO dto) {
        Category entity = modelMapper.map(dto, Category.class);
        return entity;
    }

    @Override
    public CateDTO createFromE(Category entity) {
        CateDTO dto = modelMapper.map(entity, CateDTO.class);
        return dto;
    }

    @Override
    public Category updateEntity(Category entity, CateDTO dto) {
        if (entity != null && dto != null) {
            entity.setCategoryName(dto.getCategoryName());
            entity.setDescription(dto.getDescription());
            //entity.setId(dto.getId());
        }
        return entity;
    }
}
