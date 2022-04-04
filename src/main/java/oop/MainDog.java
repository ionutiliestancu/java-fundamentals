package oop;

import java.time.LocalDate;
import java.time.LocalTime;

public class MainDog {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Max", "Labrador", 10, LocalDate.of(2022,12,12));
        Dog dog2 = new Dog("Bella", "Ciobanesc", 5, LocalDate.of(2022,10,1));

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("Is eating time? waiting for response: ");
        System.out.println(dog1.isEatingTime(LocalTime.of(12,10)));

    }
}
