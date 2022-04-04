package oop;

import java.time.LocalDate;
import java.time.LocalTime;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public LocalDate nextAvailableForAdoption;

    public Dog() {
    }

    public Dog(String name, String breed, int age, LocalDate nextAvailableForAdoption) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.nextAvailableForAdoption = nextAvailableForAdoption;
    }

    public void running() {
        System.out.println("This dog is running");
    }

    public boolean isEatingTime(LocalTime time) {
        LocalTime dateToCompareTo = LocalTime.of(12, 10);
        return time.getHour() == dateToCompareTo.getHour() && time.getMinute() == dateToCompareTo.getMinute();
    }

    @Override
    public String toString() {
        return "Dog: " +
                "name='" + this.name + '\'' +
                ", breed='" + this.breed + '\'' +
                ", age=" + this.age +
                ", nextAvailableForAdoption=" + this.nextAvailableForAdoption;
    }
}
