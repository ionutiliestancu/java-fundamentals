package task;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber;
        int lastNumber;
        int sum = 0;
        System.out.println("Please input a number: ");

        myNumber = sc.nextInt();

        while (myNumber > 0){
            lastNumber = myNumber % 10;
            sum = sum + lastNumber;
            myNumber = myNumber / 10;
        }
        System.out.println(sum);
    }
}