package inheritanceTask.employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Manager("James");
        Employee employee1 = new Develop("Miki");

        System.out.println("Name: "+employee.name +",Salary: "+ employee.calculateSalary());
        System.out.println("Name: "+employee1.name +",Salary: "+ employee1.calculateSalary());
    }
}
