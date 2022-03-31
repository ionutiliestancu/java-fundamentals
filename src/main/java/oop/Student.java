package oop;

import java.time.LocalDate;

public class Student {

    //Declarare camapuri(proprietati specifice clasei)
    public String nume;
    public String prenume;
    public int varsta;
    public LocalDate dataAbsolvirii;
    public double medie;
    public boolean integralist;

    //Declarare constructor fara parametri(conctructor default autogenerat de Java daca nu exista alt constructor)
    public Student() {
    }

    //Declarare constructor cu parametri
    public Student(String nume, String prenume, int varsta, LocalDate dataAbsolvirii, double medie, boolean integralist) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.dataAbsolvirii = dataAbsolvirii;
        this.medie = medie;
        this.integralist = integralist;
    }

    //Dunctie de afisare pentru clasa Student
    public void afisareStudent() {
        System.out.println("Studentul: nume= " + this.nume + " prenume= " + this.prenume);
        System.out.print(" varsta=" + this.varsta);
        System.out.print(" medie=" + this.medie);
        System.out.print(" dataAbsolvirii=" + this.dataAbsolvirii);
        System.out.print(" integralist=" + this.integralist);
        System.out.println();
    }
}
