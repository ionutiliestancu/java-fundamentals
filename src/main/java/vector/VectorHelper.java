package vector;

import java.util.Scanner;

public class VectorHelper {
    public static void initializareVector(int n, int[] vector, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("vector[" + i + "]= ");
            vector[i] = sc.nextInt();
        }
    }

    public static void afisareVector(int n, int[] vector) {
        for (int i = 0; i < n; i++) {
            System.out.println("vector[" + i + "]= " + vector[i]);
        }
    }
}
