package asalsayımıdeğilmi;

import java.util.Scanner;

public class AsalSayımıDeğilmi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz.");
        int n = input.nextInt();
        asal(n);
    }

    public static void asal(int num) {
        int sayac = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sayac++;
            }
        }
        if (sayac == 2) {
            System.out.println("ASALDIR...");
        } else {
            System.out.println("ASAL DEĞİLDİR..!");
        }
    }

}
