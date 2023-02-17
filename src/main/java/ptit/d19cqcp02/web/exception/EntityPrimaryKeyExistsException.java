package ptit.d19cqcp02.web.exception;

public class EntityPrimaryKeyExistsException extends RuntimeException {
    public EntityPrimaryKeyExistsException(Class<?> clazz, Long id) {
        super(clazz.getSimpleName() + " has id=" + id + " found!");
    }

    public EntityPrimaryKeyExistsException(Class<?> clazz, String id) {
        super(clazz.getSimpleName() + " has id=" + id + " found!");
    }
}
