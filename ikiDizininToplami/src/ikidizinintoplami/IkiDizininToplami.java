package ikidizinintoplami;

import java.util.Random;
import java.util.Scanner;

public class IkiDizininToplami {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rst = new Random();
        System.out.println("Olturmak istediğiniz dizilerin eleman sayısını giriniz.");
        int n = input.nextInt();
        System.out.println("Oluşturduğunuz dizilerin eleman değerlerin üst sınırını giriniz.");
        int x = input.nextInt();
        dizitop(n, x);
    }

    public static void dizitop(int num, int aralik) {
        Random rst = new Random();
        int[][] a = new int[num][num];
        int[][] b = new int[num][num];
        int[][] c = new int[num][num];
        System.out.print("1.iki boyutlu dizinin elemanları: ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                a[i][j] = rst.nextInt(aralik);
                System.out.print(a[i][j] + ",");

            }
        }
        System.out.println("");
        System.out.print("2.iki boyutlu dizinin elemanları: ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                b[i][j] = rst.nextInt(aralik);
                System.out.print(b[i][j] + ",");
            }
        }

        System.out.println("");
        System.out.println("Diğer iki boyutlu dizilerin elemanalarının toplamaından oluşan iki boyutlu dizinin elemanları: ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + ",");
            }
        }

    }
}
