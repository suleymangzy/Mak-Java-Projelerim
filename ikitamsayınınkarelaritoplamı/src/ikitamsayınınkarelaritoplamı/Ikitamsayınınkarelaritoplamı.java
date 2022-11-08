
// KARELERİNİN TOPLAMI KULLANICI TARAFINDAN GİRİLEN SAYIYA EŞİT OLAN İKİ DEĞERİ BULAN PROGRAM

package ikitamsayınınkarelaritoplamı;

import java.util.Scanner;

public class Ikitamsayınınkarelaritoplamı {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        int x = input.nextInt();
        int a, b;
        for (a = 0; a < x; a++) {
            for (b = 0; b < x; b++) {
                if (x == (a * a + b * b)) {
                    System.out.println(a + "," + b);

                }

            }
        }

    }

}
