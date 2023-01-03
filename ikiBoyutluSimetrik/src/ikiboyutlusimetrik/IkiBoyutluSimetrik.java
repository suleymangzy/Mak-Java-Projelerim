package ikiboyutlusimetrik;

import java.util.Scanner;

public class IkiBoyutluSimetrik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("satır sütun uzunluğunu giriniz.");
        int n = input.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("dizinin " + (i + 1) + " e " + (j + 1) + " inci elemanını giriniz");
                a[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i!=j) && (a[i][j] != a[j][i])) {
                    System.out.println("simetrik değildir...");
               System.exit(0);// programı sonlandırır (koşulun sağlandığı durumlarda)
                } 
            }
        }
        System.out.println("simetriktir");

    }

}
