package javatime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class JavaTimePart2 {

    public static void main(String[] args) {

        //LocalDateTime test = LocalDateTime.of(LocalDate.now(), LocalTime.now());

        // to measure time intervals -> Duration / Period

        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime localDateTimeAfterTenDays = currentDateTime.plusDays(10);

        System.out.println(currentDateTime);
        System.out.println(localDateTimeAfterTenDays);

        long duration = Duration.between(currentDateTime, localDateTimeAfterTenDays).toMinutes();
        System.out.println(duration);

        Period period = Period.between(LocalDate.now().minusYears(5), LocalDate.now()); // cannot be used with time
        System.out.println(period.getYears());
    }
}
