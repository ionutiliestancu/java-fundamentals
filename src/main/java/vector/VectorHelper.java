package vector;

import java.util.Scanner;

public class VectorHelper {
    public static int [] createVector() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti dimensiunea vectorului: ");
        int n = sc.nextInt();
        //Declarare vector cu dimensiunea introdusa de la tastatura
        int[] vector= new int [n];
        //Initializare vector cu valori date de la tastatura
        for (int i = 0; i < vector.length; i++) {
            System.out.print("vector[" + i + "]= ");
            vector[i] = sc.nextInt();
        }
        // returnam vectorul cu valori initializate
        return vector;
    }
    public static void afisareVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector[" + i + "]= " + vector[i]);
        }
    }
}
