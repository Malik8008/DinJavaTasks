package exceptionTasks.task3;


public class NumberFormatTask {
    public static void main(String[] args) {
        try {
            String streetName = "5A";
            int a = Integer.parseInt(streetName);
            System.out.println(a);

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
