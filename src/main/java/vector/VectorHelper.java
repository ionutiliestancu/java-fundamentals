package vector;

import java.util.Scanner;

public class VectorHelper {
    public static void initializareVector(int[] vector, Scanner sc) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("vector[" + i + "]= ");
            vector[i] = sc.nextInt();
        }
    }

    public static void afisareVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector[" + i + "]= " + vector[i]);
        }
    }
}
