package dateTime.task1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("LocalDate: " + currentDate);
        System.out.println("LocalTime: " + currentTime);
        System.out.println("LocalDateTime: " + currentDateTime);
    }
}
