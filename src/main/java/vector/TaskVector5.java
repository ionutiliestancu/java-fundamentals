package vector;

import vector.VectorHelper;

public class TaskVector5 {
    public static void main(String[] args) {
        // Declararea vectorului folosind metoda createVector
        int[] vector = VectorHelper.createVector();

        VectorHelper.afisareVector(vector);
        computeArithmetic(vector);

    }
    public static void computeArithmetic(int [] vector){
        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            sum = sum + vector[i];
        }
        System.out.println("Media aritmetica a elementelor este: " + sum / vector.length);
    }
}
