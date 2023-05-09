package ptit.d19cqcp02.web.controller.impl;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ptit.d19cqcp02.web.controller.IBaseController;
import ptit.d19cqcp02.web.controller.IGetController;
import ptit.d19cqcp02.web.model.dto.EventDTO;
import ptit.d19cqcp02.web.service.impl.EventServiceImpl;

import javax.annotation.Resource;


@CrossOrigin("*")
@RestController
@RequestMapping("api/event")
@Tag(name = "Event")
public class EventControllerImpl implements IBaseController<EventDTO, Long, EventServiceImpl>
        , IGetController<EventDTO, Long, EventServiceImpl> {
        @Resource
        @Getter
        private EventServiceImpl service;
}
