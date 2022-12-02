package ikizasllar;

import java.util.Scanner;

public class Ikizasllar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("üst sınırı giriniz");
        int n = input.nextInt();
        int s = 0, s2 = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    s++;
                }
            }
            if (s == 2) {
                for (int j = 1; j <= i + 2; j++) {
                    if ((i+2)% j == 0) {
                        s2++;
                    }
                }

                s -= 2;
            }
            if (s2 == 2) {
                System.out.println(i + "," + (i + 2));
                s2 -= 0;
            }
            if (s2 >= 2) {
                s2 = 0;
            }

            if (s >= 2) {
                s = 0;

            }
        }

    }
}
