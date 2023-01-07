package diziküçüktenbüyüğe;

import java.util.Scanner;
import java.util.Random;

public class DiziKüçüktenBüyüğe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("dizinin eleman sayısını giriniz.");
        int n = input.nextInt();
        System.out.println("elemanların olmasını istediğiniz aralığı giriniz.");
        int x = input.nextInt();
        dizi(n, x);
    }

    public static void dizi(int num1, int num2) {
        Random rst = new Random();
        int[] a = new int[num1];
        System.out.print("a dizinin elemanları: ");
        for (int i = 0; i < num1; i++) {
            a[i] = rst.nextInt(num2);
            System.out.print(a[i] + ",");
        }

        int g;
        for (int i = 0; i < num1; i++) {
            for (int j = i+1; j < num1-1; j++) {
                if (a[i] > a[j]) {
                    g = a[i];
                    a[i] = a[j];
                    a[j] = g;
                }
            }
        }
        System.out.println("");
        System.out.print("küçükten büyüğe a dizisi:");
        for (int i = 0; i < num1; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
