package ptit.d19cqcp02.web.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ptit.d19cqcp02.web.exception.NotFoundException;
import ptit.d19cqcp02.web.model.dto.OrderDTO;
import ptit.d19cqcp02.web.model.dto.OrderDetailDTO;
import ptit.d19cqcp02.web.model.entity.Order;
import ptit.d19cqcp02.web.model.entity.OrderStatus;
import ptit.d19cqcp02.web.repository.IOrderRepository;
import ptit.d19cqcp02.web.service.IBaseService;
import ptit.d19cqcp02.web.service.IModelMapper;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class OrderServiceImpl implements IBaseService<OrderDTO, Long>, IModelMapper<OrderDTO, Order> {
  private final IOrderRepository repository;
  private final ModelMapper modelMapper;
  private final OrderDetailServiceImpl orderDetailRepository;

  public OrderServiceImpl(IOrderRepository repository, ModelMapper modelMapper, OrderDetailServiceImpl orderDetailRepository) {
    this.repository = repository;
    this.modelMapper = modelMapper;

    this.orderDetailRepository = orderDetailRepository;
  }

  public List<OrderDTO> findAll() {
    return this.createFromEntities(this.repository.findAll());
  }

  public List<OrderDTO> findAll(Long userId) {
    return this.createFromEntities(this.repository.findByUser_Id(userId));
  }

  public OrderDTO findById(Long id) {
    Optional<Order> entity = Optional.ofNullable(repository.findById(id)
            .orElseThrow(() -> new NotFoundException(Order.class, id)));
    return createFromE(entity.get());
  }

  public OrderDTO update(Long id, OrderDTO dto) {
    Optional<Order> entity = repository.findById(id);
    entity.orElseThrow(() -> new NotFoundException(Order.class, id));
    return createFromE(repository.save(updateEntity(entity.get(), dto)));
  }

  public OrderDTO save(OrderDTO t) {
    Date date = new Date();
    Order entity = createFromD(t);
    //if(t.getTime()==null)
    entity.setOrderTime(date);
    entity.setOrderStatus(OrderStatus.PREPARE);
    repository.save(entity);
    entity = repository.findByOrderTime(date).get();
    OrderDetailDTO detail = null;
    // OrderDetailKey key = null;
    for (Map.Entry<Long, Integer> e : t.getOrderDetails().entrySet()) {
        detail = new OrderDetailDTO();
        detail.setProductId(e.getKey());
        detail.setOrderId(entity.getOrderId());
        detail.setAmount(e.getValue());
        orderDetailRepository.save(detail);

    }
    return createFromE(entity);
  }

  public OrderDTO delete(Long id) {
    Optional<Order> entity = Optional.ofNullable(repository.findById(id)
            .orElseThrow(() -> new NotFoundException(Order.class, id)));
    repository.delete(entity.get());
    return createFromE(entity.get());
  }

  public Order createFromD(OrderDTO dto) {
    Order entity = modelMapper.map(dto, Order.class);
    return entity;
  }

  public OrderDTO createFromE(Order entity) {
    OrderDTO dto = modelMapper.map(entity, OrderDTO.class);
    return dto;
  }

  public Order updateEntity(Order entity, OrderDTO dto) {
    if (entity != null && dto != null) {
        entity.setOrderAddress(dto.getOrderAddress());
      //entity.setOrderid(dto.getOrderId());
      //entity.setStatus(dto.getStatus());
      //entity.setTime(dto.getTime());

    }

    return entity;
  }
}
