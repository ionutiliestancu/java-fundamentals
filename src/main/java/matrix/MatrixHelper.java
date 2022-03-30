package matrix;

public class MatrixHelper {

    public static void afisare(int [][] matrice){
        for (int i = 0; i < matrice.length; i++){
            for (int j = 0; j < matrice[i].length; j++){
                System.out.print(matrice[i][j]+" ");
            }
            System.out.println();
        }
    }
}
