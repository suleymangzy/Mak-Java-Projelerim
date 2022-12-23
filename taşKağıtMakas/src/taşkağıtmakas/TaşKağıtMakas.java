package taşkağıtmakas;

import java.util.Scanner;
import java.util.Random;

public class TaşKağıtMakas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rastgele = new Random();

        String[] alet = {"TAŞ", "KAĞIT", "MAKAS"};
        int secim;
        do {
            System.out.println("Seçiniz:");
            System.out.println("1-TAŞ");
            System.out.println("2-KAĞIT");
            System.out.println("3-MAKAS");

            secim = input.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Seçiminiz: TAŞ");
                    break;
                case 2:
                    System.out.println("Seçiminiz: KAĞIT");
                    break;
                case 3:
                    System.out.println("Seçiminiz: MAKAS");
                    break;
                default:
                    System.out.println("Geçersiz  seçim değeri girdiniz.Tekrar deneyiniz.");
            }
        } while (secim > 3 || secim < 1);

        int n = rastgele.nextInt(3);
        String x = alet[n];
        System.out.println("Bilgisayır seçimi: " + x);

        if ((n == 0) && (secim == 1)) {
            System.out.println("BERABERE");
        } else if ((n == 0) && (secim == 2)) {
            System.out.println("KAZANDINIZ");
        } else if ((n == 0) && (secim == 3)) {
            System.out.println("KAYBETİNİZ");
        } else if ((n == 1) && (secim == 1)) {
            System.out.println("KAYBETİNİZ");
        } else if ((n == 1) && (secim == 2)) {
            System.out.println("BERABERE");
        } else if ((n == 1) && (secim == 3)) {
            System.out.println("KAZANDINIZ");
        } else if ((n == 2) && (secim == 1)) {
            System.out.println("KAZANDINIZ");
        } else if ((n == 2) && (secim == 2)) {
            System.out.println("KAYBETİNİZ");
        } else if ((n == 2) && (secim == 3)) {
            System.out.println("BERABERE");
        }

    }

}
