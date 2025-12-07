package oop.CreateEmployeeAndAdrressClass;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Alibala Abdulllayev","Baku","AZ1009");
        Address address2 = new Address("Yeni Yasamal","Baku","AZ1010");
        Employee employee = new Employee("Malik",2000,address);
        Employee employee2 = new Employee("Polad",2500,address2);
        employee.showEmployeeDetails();
        employee2.showEmployeeDetails();
    }
}
