package exceptionTasks.task11;

import java.util.Scanner;

public class BankAccount {
    int balance=0;
    public void depositBalance(int deposit){
        this.balance+=deposit;
    }

    public void withdrawBalance(int money){
        this.balance-=money;
        System.out.println(balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Please grow up your balance: ");
            int deposit = sc.nextInt();
            System.out.print("Withdraw your balance: ");
            int withDraw= sc.nextInt();
            BankAccount ba= new BankAccount();
            ba.depositBalance(deposit);
            if (withDraw>deposit){
                throw new moreWithdrawException("Invalid Balance");
            }
            System.out.print("Current balance: ");
            ba.withdrawBalance(withDraw);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
