package homework;

import java.util.Scanner;

public class UglyNumberV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert the no = ");
        int n = sc.nextInt();

        if (n <=0) {
            System.out.println("Insert a correct number");
        }

        while (n != 1) {
            if (n % 5 == 0) {
                n /= 5;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                System.out.print("Is not an ugly number");
                return;
            }
        }
        System.out.print("Is an ugly number");
    }
}
