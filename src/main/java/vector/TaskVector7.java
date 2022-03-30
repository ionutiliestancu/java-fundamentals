package vector;

public class TaskVector7 {

    public static void main(String[] args) {
        int [] vector = VectorHelper.createVector();
        VectorHelper.afisareVector(vector);

        System.out.println("Numerele pare sunt: ");
        for (int i = 0; i < vector.length; i++){
            if (vector[i]%2==0){
                System.out.println(vector[i] );
            }
        }
    }
}
