package dateTime.task3;

import java.time.LocalDate;

public class CompareDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2001, 5, 12);

        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day of Week: " + date.getDayOfWeek());
    }
}
