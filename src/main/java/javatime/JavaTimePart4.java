package javatime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaTimePart4 {

    public static void main(String[] args) {

        // parsing String -> LocalDate

        String localDateAsString1 = "17/01/2022";
        String localDateAsString2 = "17.01.2022";
        String localDateAsString3 = "17//01//2022";

        // LocalDate -> 2022-01-17; (parse)

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse(localDateAsString1, dateTimeFormatter1);
        System.out.println(localDate1);

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate2 = LocalDate.parse(localDateAsString2, dateTimeFormatter2);
        System.out.println(localDate2);

        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd//MM//yyyy");
        LocalDate localDate3 = LocalDate.parse(localDateAsString3, dateTimeFormatter3);
        System.out.println(localDate3);

        String localTimeToBeParsed = "19//38.10";   // -> HH:mm:ss (default format for LocalTime)
        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("HH//mm.ss");
        LocalTime localTime4 = LocalTime.parse(localTimeToBeParsed, dateTimeFormatter4);
        System.out.println(localTime4);
    }

}
