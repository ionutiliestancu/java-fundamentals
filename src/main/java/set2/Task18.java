package set2;

import matrix.MatrixHelper;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti de la tastatura dimensiunea:");
        int dimensiune = sc.nextInt();
        int [][] matrice = new int[dimensiune][dimensiune];
        for ( int i=0; i<matrice.length; i++){
            for (int j=0; j<matrice[i].length; j++){
                matrice[i][j]= (i+1)*(j+1);
            }
        }
        MatrixHelper.afisare(matrice);
    }
}
