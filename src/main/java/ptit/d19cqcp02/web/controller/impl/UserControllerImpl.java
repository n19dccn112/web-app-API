package ptit.d19cqcp02.web.controller.impl;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ptit.d19cqcp02.web.controller.IBaseController;
import ptit.d19cqcp02.web.controller.IGetController;
import ptit.d19cqcp02.web.model.dto.UserDetailDTO;
import ptit.d19cqcp02.web.service.impl.UserDetailServiceImpl;

import javax.annotation.Resource;

@CrossOrigin("*")
@RestController
@RequestMapping({"api/users"})
@Tag(
        name = "User"
)
public class UserControllerImpl implements IBaseController<UserDetailDTO, Long, UserDetailServiceImpl>
        , IGetController<UserDetailDTO, Long, UserDetailServiceImpl> {
    @Resource
    @Getter
    private UserDetailServiceImpl service;
}
