package ptit.d19cqcp02.web.controller.impl;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ptit.d19cqcp02.web.controller.IBaseController;
import ptit.d19cqcp02.web.controller.IGetController;
import ptit.d19cqcp02.web.model.dto.CateDTO;
import ptit.d19cqcp02.web.service.impl.CategoryServiceImpl;

import javax.annotation.Resource;

@CrossOrigin("*")
@RestController
@RequestMapping("api/categories")
@Tag(name = "Categories")
public class CategoryControllerImpl implements IBaseController<CateDTO, Long, CategoryServiceImpl>
        , IGetController<CateDTO, Long, CategoryServiceImpl> {
  @Resource
  @Getter
  private CategoryServiceImpl service;
}
