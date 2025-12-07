package methods;

import java.util.Scanner;

public class CelsiusToFahrenheitTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Celsius to Fahrenheit: ");
        int celsius = input.nextInt();
        System.out.println("result: " + celsiusToFahrenheit(celsius));
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius*((double)9 /5)+32);
    }
}
