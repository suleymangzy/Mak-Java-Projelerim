package biröncekisatırsütun;

import java.util.Scanner;
import java.util.Random;

public class BirÖncekiSatırSütun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rastgele = new Random();
        System.out.println("matrisin satır sütun uzunluğunu giriniz");
        int n = input.nextInt();
        int[][] a = new int[n][n];
        System.out.print("matris elemanları: ");
        int t = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rastgele.nextInt(100);
                System.out.print(a[i][j] + ",");
                if (j == (n - 1)) {
                    t += a[i][j];
                }
                if (i == (n - 1)) {
                    t += a[i][j];
                }
            }
        }
        t -= a[n - 1][n - 1];
        System.out.println("sonuç: "+t);
    }

}
