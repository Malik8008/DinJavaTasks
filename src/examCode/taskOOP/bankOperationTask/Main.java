package examCode.taskOOP.bankOperationTask;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1243536",200);
        bankAccount.deposit(10);
        bankAccount.withdraw(500);
    }
}
