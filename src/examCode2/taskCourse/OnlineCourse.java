package examCode2.taskCourse;

public class OnlineCourse extends  Course{
    String platform;
    int duration;

    public OnlineCourse(String courseName, String instructor, int credit,String platform, int duration) {
        super(courseName, instructor, credit);
        this.platform = platform;
        this.duration = duration;
    }

    public void displayCourse(){
        super.displayCourse();
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration);
    }

    public String getCertificate() {
        if (duration>=20){
            return "Congrutulation, you win certificate!";
        }
        return "Sansinizi bir daha yoxlayin";
    }
}
