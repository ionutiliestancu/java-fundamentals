package task;

import java.util.Scanner;

public class Task6Homework {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = scn.nextInt();

        while (n <= 0) {
            System.out.print("Wrong number! Please insert another number: ");
            n = scn.nextInt();

        }
        //declarare rezultat
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + (double) 1 / i;
        }
        System.out.println("Harmonic sum is: " + sum);
    }
}