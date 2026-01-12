package exceptionTasks.task12.insufficientAndDailyLimit;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
