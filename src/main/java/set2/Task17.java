package set2;

public class Task17 {
    public static void main(String[] args) {
        int[][] matrice = new int[5][5];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if(i==j){
                    matrice[i][j] = i;
                }
            }
        }
        afisare(matrice);
    }
    public static void afisare(int [][] matrice){
        for (int i = 0; i < matrice.length; i++){
            for (int j = 0; j < matrice[i].length; j++){
                System.out.print(matrice[i][j]+" ");
            }
            System.out.println();
        }
    }
}
