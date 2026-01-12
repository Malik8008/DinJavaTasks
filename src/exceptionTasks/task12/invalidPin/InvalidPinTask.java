package exceptionTasks.task12.invalidPin;

import java.util.Scanner;

public class InvalidPinTask {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your pin: ");
            String pin = scanner.nextLine();
            if (!pin.equals("7774")) {
                throw new InvalidPinException("Invalid PIN");
            }
            System.out.println("Your pin: " + pin);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
