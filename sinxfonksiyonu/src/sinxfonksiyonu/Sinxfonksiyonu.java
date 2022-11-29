package sinxfonksiyonu;

import java.util.Scanner;

public class Sinxfonksiyonu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("x değerini giriniz");
        int x = input.nextInt();
        System.out.println("n değerini giriniz");
        int n = input.nextInt();
        int t = 0;
        for (int i = 0; i < n; i++) {
            int f = 1;
            for (int j = 0; j < 2 * i - 1; j++) {
                f *= j;

            }
        t=  (int) (t+(Math.pow(-1, i-1)*Math.pow(x, 2*i-1))/f);
        }
        System.out.println("sin"+x+":\t"+t);
    }

}
