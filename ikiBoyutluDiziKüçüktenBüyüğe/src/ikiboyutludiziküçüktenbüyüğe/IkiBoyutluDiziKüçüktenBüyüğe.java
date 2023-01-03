package ikiboyutludiziküçüktenbüyüğe;

import java.util.Scanner;
import java.util.Random;

public class IkiBoyutluDiziKüçüktenBüyüğe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rastgele = new Random();
        System.out.println("matrisin satır sütun uzunluğunu giriniz");
        int n = input.nextInt();
        int[][] a = new int[n][n];
        System.out.print("matris elemanları: ");
        int[][][] b = new int[n][n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rastgele.nextInt(100);
                System.out.print(a[i][j] + ",");
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][i][j] = a[i][j];
            }
        }
       int f;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (b[i][i][j] > b[i][i][k]) {
                        f = b[i][i][j];
                        b[i][i][j] = b[i][i][k];
                        b[i][i][k] = f;
                    }
                }
            }
        }
      
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1)+" inci satır sıralaması: ");
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][i][j] + ",");
            }
            System.out.println(" ");
        }

    }

}
