package asalçarpanlar;

import java.util.Scanner;

public class Asalçarpanlar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 den büyük bir sayı giriniz.");
        int x = input.nextInt();
        for (int i = 2; 1 < x; i++) {

            if (x % 2 == 0) {

                while (x % 2 == 0) {
                    x = x / 2;
                }
                System.out.print("2,");
            }

            if (x % i == 0 && i % 2 != 0) {
                System.out.print(i + ",");
                x /= i;
            }

        }

    }

}
