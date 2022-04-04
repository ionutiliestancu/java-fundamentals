package company;

import java.util.Arrays;

public class Company {

    private String name;
    private Employee[] employees;

    public Company(){
    }

    // Modificator de acces - void(aceste metode nu returneaza nimic, el doar seteaza atribute) - set_nume atribut(tipul obiectului ce va fi setat - nume obiect)
    public void setName(String name){
        this.name =name;

    }

    public void setEmployees(Employee[] employees){
        this.employees = employees;

    }

    //Modificator de acces - tipul de date al obiectului ce va fi returnat - get_nume atribut(aceste metode nu primesc parametrii)
    public String getName(){
        return this.name;

    }

    public Employee[] getEmployees(){
        return  this.employees; // aceste metode trebuie sa returneze obiectul respectiv
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
