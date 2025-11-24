package OOP.CreateEmployeeAndAdrressClass;

public class Employee {
    String name;
    double salary;
    Address address;

    public Employee(String name, double salary, Address address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    //nəticəni aldıqdan sonra chatgpt-ə atdim burda düzgün olmadığın bildirdi.
    //Employee-ni this ilə əvəz etməyimi bildirdi.
//    public void showEmployeeDetails(Employee employee) {
//        System.out.println(employee);
//    }

    public void showEmployeeDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", salary=" + salary +
                        ", address=" + address;
    }
}
