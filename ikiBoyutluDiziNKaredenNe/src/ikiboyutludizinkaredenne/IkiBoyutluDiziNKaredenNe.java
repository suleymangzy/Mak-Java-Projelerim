package ikiboyutludizinkaredenne;

import java.util.Scanner;
import java.util.Random;

public class IkiBoyutluDiziNKaredenNe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rst = new Random();
        System.out.println("satır ve sütun sayısını giriniz.");
        int n = input.nextInt();
        int[][] a = new int[n][n];
        int[] b = new int[n];
        System.out.println("a dizisinin elemanları: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rst.nextInt(100);
                System.out.print(a[i][j] + ",");
            }
        }
        for (int i = 0; i < n; i++) {
                    b[i] = 1;
            for (int j = 0; j < n; j++) {
                b[i] *= a[j][i];
            }
        }
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " inci sütun elemanlarının çarpımı: " + b[i]);
        }
    }

}
