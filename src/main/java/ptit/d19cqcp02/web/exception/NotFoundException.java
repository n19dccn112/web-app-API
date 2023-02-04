package ptit.d19cqcp02.web.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(Class<?> clazz, Long id) {
        super(clazz.getName().replace("com.ptit.d19cqcp02.web.model.entity.", "") + " has id=" + id + " not found!");
    }

    public NotFoundException(Class<?> clazz, String id) {
        super(clazz.getName().replace("com.ptit.d19cqcp02.web.model.entity.", "") + " has id=" + id + " not found!");
    }

    public NotFoundException(String msg) {
        super(msg);
    }

}
