package task;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Pana la ce numar sa verific: ");

        int numar = scan.nextInt();

        for (int i = 2; i < numar; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }

    }

    //alta functie de tip boolean care primeste un parametru int pe care il verifica daca este prim sau nu
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

}