package student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StudentMenu {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Specify the number of students: ");
        int numberOfStudents = keyboard.nextInt(); // Setting the number of students
        Student[] students = new Student[numberOfStudents]; // Creating the array of students

        for (int i = 0; i < students.length; i++) {
            keyboard.nextLine();
            Student currentStudent = getStudent(keyboard, i);

            // Setting the current student on the corresponding position of the array
            students[i] = currentStudent;
        }
        keyboard.nextLine();
        int choice = 0;
        while (choice != 9) {
            displayOptions();
            choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < students.length; i++) {
                        Student studentOnIndexI = students[i];
                        studentOnIndexI.displayStudent();
                    }
                    break;
                case 2:
                    searchStudent(students, keyboard);
                    break;
                case 3:
                    bestAverage(students);
                    break;
                case 4:

                    break;
                case 9:
                    break;
                default:
                    System.out.print("Wrong number, please select again!");
            }
        }

    }

    private static Student getStudent(Scanner keyboard, int i) {
        Student currentStudent = new Student();
        System.out.print("Senior[" + i + "]surname: ");
        currentStudent.surname = keyboard.nextLine();
        System.out.print("Senior[" + i + "]name: ");
        currentStudent.name = keyboard.nextLine();
        System.out.print("Senior[" + i + "]age: ");
        currentStudent.age = keyboard.nextInt();
        System.out.print("Senior[" + i + "]graduation date dd.MM.yyyy : ");
        currentStudent.graduationDate = enterDate();
        System.out.print("Senior[" + i + "]average grade: ");
        currentStudent.average = keyboard.nextDouble();
        System.out.print("Senior[" + i + "]all exams passed: ");
        currentStudent.allExamsPassed = keyboard.nextBoolean();
        return currentStudent;
    }


    public static LocalDate enterDate() {
        Scanner keyboard = new Scanner(System.in);
        String stringDate = keyboard.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(stringDate, formatter);
    }

    public static void searchStudent(Student[] students, Scanner keyboard) {
        keyboard.nextLine();
        System.out.println("Search student by name...");
        System.out.print("Enter student surname: ");
        String searchSurname = keyboard.nextLine();
        System.out.print("Enter student name: ");
        String searchName = keyboard.nextLine();
        boolean studentFound = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].surname.equalsIgnoreCase(searchSurname) && students[i].name.equalsIgnoreCase(searchName)) {
                System.out.println("Student named " + searchSurname + " " + searchName + " found: ");
                students[i].displayStudent();
                studentFound = true;
            }
        }
        if (studentFound == false) {
            System.out.print("Student not found.");
        }
    }

    public static void bestAverage(Student[] students) {
        double maxAverage = 0;
        Student studentWithMaxAverage = null;
        for (int i = 0; i < students.length; i++) {
            if (maxAverage < students[i].average) {
                maxAverage = students[i].average;
                studentWithMaxAverage = students[i];
            }
        }
        if (null != studentWithMaxAverage) {
            System.out.println("Student with highest average is: ");
            studentWithMaxAverage.displayStudent();
        } else {
            System.out.println("Not available info.");
        }
    }

    public static void displayOptions() {
        System.out.println("Please select next action: " +
                "\n 1.Display all seniors" +
                "\n 2.Search senior by name" +
                "\n 3.Display senior with highest average" +
                "\n 4.Create new list" +
                "\n 9.Exit");
        System.out.print("--> ");
    }
}
