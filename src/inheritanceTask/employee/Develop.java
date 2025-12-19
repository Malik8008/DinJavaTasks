package inheritanceTask.employee;

public class Develop extends Employee{
    public Develop(String name) {
        super(name);
    }

    @Override
    double calculateSalary(){
        return 2800;
    }
}
