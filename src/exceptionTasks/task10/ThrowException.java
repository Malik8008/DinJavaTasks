package exceptionTasks.task10;

public class ThrowException {
    public static void main(String[] args) {
        try {
            int a=10/0;
        }catch (ArithmeticException e){
            throw new ArithmeticException("divide byZero");
        }
    }
}
