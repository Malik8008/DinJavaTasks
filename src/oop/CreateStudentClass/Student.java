package oop.CreateStudentClass;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String displayInfo() {
        return "Name: " + name + ", Age: " + age;
    }

}
