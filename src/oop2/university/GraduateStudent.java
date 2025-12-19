package oop2.university;

public class GraduateStudent extends Student {

    double bonus;

    public GraduateStudent(String name, double grade, double bonus) {
        super(name, grade);
        this.bonus = bonus;
    }

    @Override
    double getFinalGrade() {
        return grade + this.bonus;
    }
}
