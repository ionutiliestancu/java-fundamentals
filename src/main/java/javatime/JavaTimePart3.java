package javatime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class JavaTimePart3 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // format: yyyy-MM-dd

        // dd / MM / yyyy

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String localDateFormatted = localDate.format(formatter);
        System.out.println(localDateFormatted);

        ZonedDateTime localDateTime = ZonedDateTime.now();
        String dateTimeFormatted = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(dateTimeFormatted);


        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // format: HH:mm:ss.mmm

        // HH-mm-ss
        DateTimeFormatter timePattern = DateTimeFormatter.ofPattern("HH-mm / ss");
        String localTimeFormatted = localTime.format(timePattern);
        System.out.println(localTimeFormatted);

        System.out.println("Hours: " + localTime.getHour() + ". Minutes: " + localTime.getMinute());

    }
}
