package exceptionTasks.task9;

public class ExceptionPropagation {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        throw new RuntimeException("Throw exception with method3");
    }
}
