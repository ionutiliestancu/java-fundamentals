package set2;

import java.util.Scanner;

public class Task17Detail {

    public static void main(String[] args) {

        // Creating scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Define your matrix length and width... ");

        System.out.print("Insert matrix length: ");
        // We take input from keyboard for matrix length
        int matrixRow = sc.nextInt();
        System.out.println("");

        System.out.print("Insert matrix width: ");
        // We take input from keyboard for matrix width
        int matrixColumn = sc.nextInt();
        System.out.println("");


        // Initialize the yardArray with the defined bonds that we gave from keyboard
        int[][] matrixArray = new int[matrixRow][matrixColumn];

        for (matrixRow = 0; matrixRow < matrixArray.length; matrixRow++) {
            for (matrixColumn = 0; matrixColumn < matrixArray[matrixRow].length; matrixColumn++) {
                if (matrixRow == matrixColumn) {
                    matrixArray[matrixRow][matrixColumn] = matrixRow;
                    System.out.print(matrixArray[matrixRow][matrixColumn] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
}
