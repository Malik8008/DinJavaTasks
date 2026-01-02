package examCode2.taskException;

public class Main {
    public static void main(String[] args) {
        DivideByZero divideByZero = new DivideByZero();
        try {
            int result = divideByZero.divide(10,0);
            System.out.println(result);
        }catch (DivideByZeroException e){
            System.out.println(e.getMessage());
        }
    }
}
