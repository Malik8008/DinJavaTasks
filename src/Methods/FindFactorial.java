package Methods;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int fact = sc.nextInt();
        System.out.println(factorial(fact));
    }

    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact *=i;
        }
        return fact;
    }
}
