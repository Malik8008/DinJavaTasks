package exceptionTasks.task12.insufficientAndDailyLimit;

public class InsufficientAndDailyLimitTask {
    public static void main(String[] args) {
        try {
            withdrawBalance(140);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static double balance = 400;
    static double dailyLimit = 250;

    public static void withdrawBalance(int amount) {
        balance -= amount;
        if (amount > balance || amount > dailyLimit) {
            throw new InsufficientBalanceException("Insufficient funds for this withdrawal.");
        }
        System.out.println("Your balance: " + balance);
    }

}
