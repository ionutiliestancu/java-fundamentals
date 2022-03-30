package task;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un text de la tastatura: ");
        String text = sc.nextLine();
        String[] words = text.split(" ");

        // indexed loop for
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " " + words[i] + " ");
        }

        // enhanced for
        for (String currentIdentifier : words) {
            System.out.print(currentIdentifier + " " + currentIdentifier + " ");
        }

    }
}
