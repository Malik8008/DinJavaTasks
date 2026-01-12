package exceptionTasks.task5;

public class MultipleCatchTask {
    public static void main(String[] args) {
        try {
            int a=5/0;

            String s =null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
