package ptit.d19cqcp02.web.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ptit.d19cqcp02.web.exception.NotFoundException;
import ptit.d19cqcp02.web.model.dto.EventDTO;
import ptit.d19cqcp02.web.model.entity.Event;
import ptit.d19cqcp02.web.repository.IEventRepository;
import ptit.d19cqcp02.web.service.IBaseService;
import ptit.d19cqcp02.web.service.IModelMapper;

import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements IBaseService<EventDTO, Long>, IModelMapper<EventDTO, Event> {
    private final IEventRepository repository;
    private final ModelMapper modelMapper;

    public EventServiceImpl(IEventRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }


    @Override
    public List<EventDTO> findAll() {
        return createFromEntities(repository.findAll());
    }

    @Override
    public EventDTO findById(Long id) {
        Optional<Event> event = repository.findById(id);
        event.orElseThrow(() -> new NotFoundException(Event.class, id));
        return createFromE(event.get());
    }

    @Override
    public EventDTO update(Long aLong, EventDTO eventDTO) {
        return null;
    }

    @Override
    public EventDTO save(EventDTO eventDTO) {
        return null;
    }

    @Override
    public EventDTO delete(Long aLong) {
        return null;
    }

    @Override
    public Event createFromD(EventDTO dto) {
        return null;
    }

    @Override
    public EventDTO createFromE(Event entity) {
        EventDTO dto = modelMapper.map(entity, EventDTO.class);
        return dto;
    }

    @Override
    public Event updateEntity(Event entity, EventDTO dto) {
        return null;
    }
}
