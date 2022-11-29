package eüzerixihesaplayanpurogram;

import java.util.Scanner;

public class Eüzerixihesaplayanpurogram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("x değerini giriniz");
        int x = input.nextInt();
        System.out.println("n değerini giriniz");
        int n = input.nextInt();
        double t = 1, f = 1;
        for (int i = 1; i < n - 1; i++) {
            f *= i;
            t = (int) (t + Math.pow(x, i) / f);

        }
        System.out.println("Sonuç:\t"+t);
    }

}
