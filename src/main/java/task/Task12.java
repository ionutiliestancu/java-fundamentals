package task;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int textLength = text.length();
        int spaceCounter = 0;
        double percent = 0;

        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                spaceCounter++;
            }

        }
        percent = spaceCounter * 100 / textLength;
        System.out.println("Procentul de caractere este: " + percent);


    }
}