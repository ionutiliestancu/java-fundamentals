package student;

import java.time.LocalDate;

public class Student {

    // Declarare campuri (proprietati specifice clasei)
    public String surname;
    public String name;
    public int age;
    public LocalDate graduationDate;
    public double average;
    public boolean allExamsPassed;

// Declarare constructor fara parametrii (constructor default autogenerat
//  de Java daca nu este alt constructor)

    public Student() {
    }

// Declarare constructor cu parametrii

    public Student(String surname, String name, int age, LocalDate graduationDate, double average, boolean allExamsPassed) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.graduationDate = graduationDate;
        this.average = average;
        this.allExamsPassed = allExamsPassed;
    }
// Functia de afisare pt clasa Student

    public void displayStudent() {
        System.out.print("Student: surname= " + this.surname + " name= " + this.name);
        System.out.print(" age= " + this.age);
        System.out.print(" graduation date= " + this.graduationDate);
        System.out.print(" average grade= " + this.average);
        System.out.print(" all exams passed= " + this.allExamsPassed);
        System.out.println();
    }
}
