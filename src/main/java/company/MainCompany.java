package company;

import java.time.LocalDate;


/*Scrieti un program ce contine urmtoarele clase: Employee cu urmatoarele atribute:  firstName, lastName, age, dateOfBirth, salary.
        Company ce contine: name si o lista de angajati. Clasele trebuie sa contina constructori, o metoda ce realizeaza afisarea, metode pentru setarea campurilor
        (de exemplu pt name vom aveam o metoda numita setName(String name)), metode pentru extragerea informatiilor din clase, de exemplu pentru a obtine numele
        unui angajat, in clasa angajat exista metoda getFirstName - ce returneaza numele angajatului respectiv. Dupa realizarea claselor, creati o companie
        ce contine 5 anagajati, setati aceste date de la tastatura, afisati datele introduse, calculati media salariala a angajatilor, sortati angajatii dupa salariu.*/
public class MainCompany {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Irina", "Zaharia", 22, LocalDate.of(1999,6,12), 1000);
        Employee employee2 = new Employee("Andrei", "Zamfirescu", 26, LocalDate.of(1997, 12,13), 2500);
        Employee employee3 = new Employee();

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println("employee3 inainte de a avea campurile setate");
        System.out.println(employee3);


        employee3.setFirstName("Alex"); //setam manual numele
        employee3.setLastName("Ciobanu");
        employee3.setAge(28);
        employee3.setDateOfBirth(LocalDate.now());
        employee3.setSalary(2400);

        System.out.println("employee3 dupa setarea campurilor");
        System.out.println(employee3);

        Employee[] employees = new Employee[3];
        employees[0] = employee1; //pe fiecare pozitie punem un angajat
        employees[1] = employee2;
        employees[2] = employee3;

        //definim un nou obiect de tip companie !!!
        Company company1 = new Company();
        company1.setName("EMAG");
        company1.setEmployees(employees);
        System.out.println(company1);
    }
}
