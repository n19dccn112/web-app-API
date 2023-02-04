package ptit.d19cqcp02.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import ptit.d19cqcp02.web.service.IBaseService;

import java.util.List;

public interface IGetController<D, ID, S extends IBaseService<D, ID>> {
    S getService();

    @GetMapping("")
    default List<D> getAll() {
        return getService().findAll();
    }
}