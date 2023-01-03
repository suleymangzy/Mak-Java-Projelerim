package yedekköşegenmatris;

import java.util.Scanner;
import java.util.Random;

public class YedekKöşegenMatris {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rst = new Random();
        System.out.println("satır ve sütun sayısını giriniz. ");
        int n = input.nextInt();
        int[][] a = new int[n][n];
        int t = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rst.nextInt(100);
                if (i + j < n - 1) {
                    t += a[i][j];
                }
            }
        }
        System.out.print("a matrisinin elemanları: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + ",");
            }
        }
        System.out.println("");
        System.out.println("toplam: "+t);
    }
}
