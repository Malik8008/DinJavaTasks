package examCode.taskOOP.bankOperationTask;

/*
Field-lər:
accountNumber
balance
Methodlar:
deposit()
withdraw() (balance kifayət deyilsə error mesajı versin)
bütün field-lər private olsun
getter/setter istifadə et

 */
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Balance with deposit: " + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance < 0) {
            System.out.println("Error");
            return;
        }if (this.balance>=amount){
            this.balance -= amount;
            System.out.println("Balance with withdraw: " + this.balance);
        }else {
            System.out.println("No Balance");
        }

    }
}
