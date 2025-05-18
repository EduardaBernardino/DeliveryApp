package App.exceptions;

public class InvalidCPFException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public InvalidCPFException(String message) {
        super(message);
    }
}
