package homework;

import java.util.Scanner;

public class UglyNumberV2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introdu un nr.: ");
        int nr = scan.nextInt();
        if (isUgly(nr)) {
            System.out.println("Nr is ugly");
        } else {
            System.out.println("Nr is not ugly");
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isUgly(int n) {
        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
            for (int i = 7; i < n; i++) {
                if (n % i == 0 && isPrime(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
