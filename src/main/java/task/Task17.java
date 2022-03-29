package task;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        System.out.println("Introduceti data in formatul: dd.MM.yyyy");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String dateAsString = sc.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate lastDate = LocalDate.parse(dateAsString, dateTimeFormatter);
        System.out.println("Ultimul curs de live-coding va fi pe data de: " + lastDate);

        Period period = Period.between(LocalDate.now(), lastDate);
        System.out.println("Perioada pana la ultimul curs fata de ziua curenta este: " + period.getDays());

    }
}
