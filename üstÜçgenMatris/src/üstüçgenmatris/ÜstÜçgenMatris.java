package üstüçgenmatris;

import java.util.Scanner;
import java.util.Random;

public class ÜstÜçgenMatris {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rastgele = new Random();
        System.out.println("satır ve sütun sayısını giriniz");
        int n = input.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rastgele.nextInt(100);

                if (i > j) {
                    b[i][j] = 0;
                } else {
                    b[i][j] = a[i][j];
                }

            }
        }
        System.out.print("a iki boyutlu dizisi: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + ",");
            }
        }
        System.out.println(" ");
        System.out.print("b iki boyutlu dizisi: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + ",");
            }
        }

    }

}
