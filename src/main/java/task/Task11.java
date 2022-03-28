package task;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = "";
        int maxLength = 0;
        String longestText = "";

        while (!text.equals("stop")) {
            System.out.println("Introduceti textul: ");
            text = sc.nextLine();
            if (maxLength < text.length()) {
                maxLength = text.length();
                longestText = text;
            }

        }
        System.out.println("Cel mai mare text este: " + longestText);

    }
}