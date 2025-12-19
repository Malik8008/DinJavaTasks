package oop2.university;

public class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name, double grade) {
        super(name, grade);
    }

    @Override
    double getFinalGrade() {
        return grade;
    }
}
