package examCode2.taskCourse;

public class Main {
    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse("JAVA","Teacher Huseyn",18,"Udemy",40);
        onlineCourse.displayCourse();
        System.out.println(onlineCourse.getCertificate());
    }
}
