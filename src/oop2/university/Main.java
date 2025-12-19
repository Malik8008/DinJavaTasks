package oop2.university;

public class Main {
    public static void main(String[] args) {
        Student student = new UndergraduateStudent("Malik",81);
        Student student1 = new GraduateStudent("Ilqar",88,5);

        System.out.println("Student:"+student.name+", final grade is "+student.getFinalGrade());
        System.out.println("Student:"+student1.name+", final grade is "+student1.getFinalGrade());
    }
}
