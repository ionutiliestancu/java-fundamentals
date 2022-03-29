package javatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaTime {

    public static void main(String[] args) {

        // java 1.8 new feature => java.time

        // date -> LocalDate

        // time -> LocalTime

        // date + time -> LocalDateTime

        LocalDate currentDate = LocalDate.now();
        System.out.println("The current date is: " + currentDate);

        LocalDate localDate = LocalDate.of(2022, 1, 13);
        System.out.println("The current date is: " + localDate);

        System.out.println("The next date will be: " + localDate.plusDays(100));
        System.out.println("Yesterday date was: " + localDate.minusDays(11));
        System.out.println("The next week date will be: " + localDate.plusWeeks(1)); //localDate.plusYears(1);

        LocalTime currentTime = LocalTime.now();
        System.out.println("The current time: " + currentTime);

        LocalTime localTime = LocalTime.of(20, 39);
        System.out.println("The localTime time: " + localTime);

        System.out.println("The next hour will be: " + localTime.plusHours(1));
        System.out.println("An hour ago the time was: " + currentTime.minusHours(1));


        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("The current date with date and time is: " + currentDateTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 1, 13, 20, 45, 15, 10);
        System.out.println("The localDateTime date with date and time is: " + localDateTime);
        System.out.println("The localDateTime1 is: " + localDateTime1);

        System.out.println("DayOfMonth  is: " + localDate.getDayOfMonth());
        System.out.println("DayOfTheWeek is: " + localDate.getDayOfWeek());
        System.out.println("Year is: " + localDate.getYear());

        System.out.println("Date formatted: " + localDate.getDayOfMonth()  + "/" + localDate.getMonth().getValue() + "/" + localDate.getYear());

    }
}
