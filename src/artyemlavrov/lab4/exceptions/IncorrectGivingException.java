package artyemlavrov.lab4.exceptions;

public class IncorrectGivingException extends RuntimeException {

    public IncorrectGivingException(String reason) {
        super(reason);
    }
}
