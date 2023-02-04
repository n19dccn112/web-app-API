package ptit.d19cqcp02.web.exception;

public class EntityPrimaryKeyExistsException extends RuntimeException {
    public EntityPrimaryKeyExistsException(Class<?> clazz, Long id) {
        super(clazz.getName().replace("com.ptit.d19cqcp02.web.model.entity.", "") + " has id=" + id + " found!");
    }

    public EntityPrimaryKeyExistsException(Class<?> clazz, String id) {
        super(clazz.getName().replace("com.ptit.d19cqcp02.web.model.entity.", "") + " has id=" + id + " found!");
    }
}
