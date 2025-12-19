package oop2.university;

public class Student {
    String name;
    double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    double getFinalGrade() {
        return grade;
    }
}
