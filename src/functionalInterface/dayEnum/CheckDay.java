package functionalInterface.dayEnum;

public class CheckDay {
    public static void checkDay( DayOfWeek day){
        switch(day){
            case SUNDAY, SATURDAY->  System.out.println(day + " is a WEEKEND");
            default -> System.out.println(day + " is a WEEKDAY");
        }
    }
}
