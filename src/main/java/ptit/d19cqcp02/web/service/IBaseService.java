package ptit.d19cqcp02.web.service;

import java.util.List;

public interface IBaseService<D, ID> {
    List<D> findAll();

    D findById(ID id);

    D update(ID id, D d);

    D save(D d);

    D delete(ID id);

}

