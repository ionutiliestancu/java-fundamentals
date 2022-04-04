package oop;

import java.time.LocalDate;

public class StudentHelper {

    public static void main(String[] args) {
        //Declarare  student
        Student s1 = new Student();
        s1.afisareStudent();

        System.out.println(s1.toString());

        //Declarare Student folosind constructor cu paramnetrii
        Student s2 = new Student("Popescu", "Andrei", 22, LocalDate.of(2023, 7, 1), 9.5, true);
        s2.afisareStudent();

        System.out.println();
        System.out.println(s2.toString());
    }

}
