package inheritanceTask.employee;

public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }

    @Override
    double calculateSalary(){
        return 2500;
    }
}
