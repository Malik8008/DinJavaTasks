package functionalInterface.lambda;

public class Main {
    public static void main(String[] args) {
        Calculate addition = (a,b)->a+b;
        Calculate multiplication = (a,b)->a*b;
        System.out.println("Addition: "+addition.operate(5,10));
        System.out.println("Multiplication: "+multiplication.operate(7,8));
    }
}
