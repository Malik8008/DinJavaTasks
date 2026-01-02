package examCode2.taskCourse;
/*
5.	Write a Java program to create a class called "Course"
 with attributes for course name, instructor, and credits.
  Create a subclass "OnlineCourse" that adds attributes for platform and duration.
 Implement methods to display course details and check if the course is eligible for a certificate based on duration.
 */
public class Course {
    String courseName;
    String instructor;
    int price;

    public Course(String courseName, String instructor, int price) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.price = price;
    }

    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Price: " + price);
    }
}
