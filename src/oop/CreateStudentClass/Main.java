package oop.CreateStudentClass;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Malik",24);
        Student student1 = new Student("Namiq",23);
        Student student2 = new Student("Fuad",29);
        System.out.println(student.displayInfo());
        System.out.println(student1.displayInfo());
        System.out.println(student2.displayInfo());
    }
}
