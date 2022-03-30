package vector;

public class TaskVector6 {

    //afiseaza doar numerele care sunt egale cu pozitia vectorului.
    public static void main(String[] args) {
        int[] vector = VectorHelper.createVector();
        VectorHelper.afisareVector(vector);

        for (int i = 0; i < vector.length; i++) {
            if (i == vector[i]) {
                System.out.println("vector [" + i + "]= " + vector[i]);
            }
        }
    }

}
