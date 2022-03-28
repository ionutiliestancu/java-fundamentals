package homework;

import java.util.Scanner;

public class Homework1EcuatiaDeGradul3 {
    public static void main(String[] args) {
        double a, b, c, d, p, q, delta, Q, P , y1;
        String y2,y3 ="0";
        char i = 'i';



        Scanner scn = new Scanner(System.in);
        System.out.print("Introduceti primul numar a = ");
        a = scn.nextInt();
        System.out.print("Introduceti al doilea numar b = ");
        b = scn.nextInt();
        System.out.print("Introduceti al treilea numar c = ");
        c = scn.nextInt();
        System.out.print("Introduce patrulea numar d = ");
        d = scn.nextInt();
        System.out.println();


        p = (c / a) - Math.pow(b, 2) / 3 * Math.pow(a, 2);
        q = (2 * Math.pow(b, 3)) / (27 * Math.pow(a, 3)) - ((b * c) / 3 * Math.pow(a, 2)) + d / a;

        delta = Math.pow(p / 3, 3) + Math.pow(q / 2, 2);

        if(delta<0) {
            System.out.println("Ecuatia are 3 radacini reala,distincte!\n\n\n");
        }else if(delta==0){
            System.out.println("Ecuația are 3 rădăcini reale, dintre care cel putin două sunt egale!\n\n\n");
        }
        else {
            System.out.println(" Ecuația are o singură rădăcină reală și două rădăcini complexe, conjugate!\n\n\n");
        }

        P = Math.cbrt(-(q / a) + Math.sqrt((Math.pow(p / 3, 2) + Math.pow(q / 2, 2))));
        Q = Math.cbrt(-(q / a) - Math.sqrt((Math.pow(p / 3, 2) + Math.pow(q / 2, 2))));

        y1 = P + Q;
        y2 = "-" + "(" + (P+Q)/2 + " +i" + "*" + "(" + ((P-Q)/2)*Math.sqrt(3)+ ")";
        //  y3 = - ((P+Q)/2 - 'i'*( ((P-Q)/2)*Math.sqrt(3)));

        System.out.println("Radacina lui y1 este " + y1);
        System.out.println("Radacina lui y2 este " + y2);
        System.out.println("Radacina lui y3 este " + y3);

    }
}