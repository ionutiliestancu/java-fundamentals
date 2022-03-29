package task;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the positive number from keyboard");

        System.out.print("n= ");
        int n = sc.nextInt();

        for (int i = 2; i <=n; i++) {
            int counter = 0;
            for(int j=1; j<=i;j++){
                if(i%j==0){
                    counter++;
                }
            }
            if(counter == 2){
                System.out.println("Nr prim: " + i);
            }
        }
    }
}
