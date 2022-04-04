package company;

import java.time.LocalDate;

public class Employee {

    //Definire atribute
    private String firstName;
    private String lastName;
    private int age;
    private LocalDate dateOfBirth;
    private double salary;

    //definire constructor fara parametri
    public Employee() {

    }

    ////definire constructor cu parametri
    public Employee(String firstName, String lastName, int age, LocalDate dateOfBirth, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    // metode pentru setarea atributelor (aceste metode se numesc setteri sau muttators)


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //metode pentru preluarea valorilor atributelor (aceste metode se numesc Getters sau Accesors)

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", salary=" + salary +
                '}';
    }
}
