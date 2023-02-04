package ptit.d19cqcp02.web.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ptit.d19cqcp02.web.exception.NotFoundException;
import ptit.d19cqcp02.web.model.dto.FeatureTypeDTO;
import ptit.d19cqcp02.web.model.entity.FeatureType;
import ptit.d19cqcp02.web.repository.IFeatureRepository;
import ptit.d19cqcp02.web.repository.IFeatureTypeRepository;
import ptit.d19cqcp02.web.service.IBaseService;
import ptit.d19cqcp02.web.service.IModelMapper;

import java.util.List;
import java.util.Optional;

@Service
public class FeatureTypeServiceImpl implements IBaseService<FeatureTypeDTO, String>, IModelMapper<FeatureTypeDTO, FeatureType> {
    private final IFeatureTypeRepository repository;
    private final ModelMapper modelMapper;
    private final IFeatureRepository featureRepository;

    public FeatureTypeServiceImpl(IFeatureTypeRepository repository, ModelMapper modelMapper, IFeatureRepository featureRepository) {
        this.repository = repository;
        this.modelMapper = modelMapper;
        this.featureRepository = featureRepository;
    }

    @Override
    public List<FeatureTypeDTO> findAll() {
        return createFromEntities(repository.findAll());
    }

    @Override
    public FeatureTypeDTO findById(String id) {
        Optional<FeatureType> entity = Optional.of(repository.findById(id.toUpperCase())
                .orElseThrow(() -> new NotFoundException(FeatureType.class, id.toUpperCase())));
        return createFromE(entity.get());
    }

    @Override
    public FeatureTypeDTO save(FeatureTypeDTO dto) {
        return createFromE(repository.save(createFromD(dto)));
    }

    @Override
    public FeatureTypeDTO update(String id, FeatureTypeDTO dto) {
        Optional<FeatureType> entity = repository.findById(id.toUpperCase());
        entity.orElseThrow(() -> new NotFoundException(FeatureType.class, id));
        return createFromE(repository.save(updateEntity(entity.get(), dto)));
    }

    @Override
    public FeatureTypeDTO delete(String id) {
        Optional<FeatureType> entity = Optional.ofNullable(repository.findById(id)
                .orElseThrow(() -> new NotFoundException(FeatureType.class, id)));
        repository.delete(entity.get());
        return createFromE(entity.get());
    }

    @Override
    public FeatureType createFromD(FeatureTypeDTO dto) {
        FeatureType entity = modelMapper.map(dto, FeatureType.class);
        return entity;
    }

    public FeatureTypeDTO createFromE(FeatureType entity) {
        FeatureTypeDTO dto = modelMapper.map(entity, FeatureTypeDTO.class);
        return dto;

    }

    public FeatureType updateEntity(FeatureType entity, FeatureTypeDTO dto) {
        if (entity != null && dto != null) {
            entity.setFeatureTypeName(dto.getName());
            entity.setFeatureTypeUnit(dto.getUnit());
            //entity.setId(dto.getId());

        }

        return entity;
    }
}
