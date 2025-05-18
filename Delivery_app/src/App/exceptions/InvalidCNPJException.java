package App.exceptions;

public class InvalidCNPJException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public InvalidCNPJException(String message) {
        super(message);
    }
}
