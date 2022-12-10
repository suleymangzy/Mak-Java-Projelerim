package diziortalama;

import java.util.Scanner;

public class Diziortalama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("dizinin eleman sayısını giriniz.");
        int n = input.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("dizinin\t" + (i + 1) + " inci elemanını giriniz");
            int x = input.nextInt();
            a[i] = x;
        }

        int t = 0, c = 1;
        double ht = 0, t2 = 0;
        for (int i = 0; i < n; i++) {
            t += a[i];
            c *= a[i];
            ht += 1 / a[i];
            t2 += Math.pow(a[i], 2);
        }

        double AO = t / n;
        double GO = Math.pow(c, (1 / n));
        double HO = n / ht;
        double KHO = t2 / t;

        System.out.println("dizinin aritmetik ortalaması:\t" + AO);
        System.out.println("dizinin geometrik ortalaması:\t" +GO);
        System.out.println("dizinin harmonik ortalaması:\t" +HO);
        System.out.println("dizinin kontraharmonik ortalaması:\t" +KHO);
    }

}
