package exceptionTasks.task4;

public class SingleCatchTask {
    public static void main(String[] args) {
        try {
            int a= 10/0;
            System.out.println(a);
            int[] num = new int[3];
            System.out.println(num[3]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
