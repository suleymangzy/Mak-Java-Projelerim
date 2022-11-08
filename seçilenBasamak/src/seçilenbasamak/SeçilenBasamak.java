// KULLANINICI TARAFINDAN GİRİLEN PAY VE PAYDA DEĞERLERİNİN BÖLÜMÜ SONUCU ORTAYA ÇIKAN DEĞERİN 
// KULLANICI RARAFINDA İSTENİLEN BİR BASAMAĞINI YAZDIRAN PROGRAM
// ÖRNEK : 246/2=123 <=> 123 'ÜN 1. BASAMAĞI = 3

package seçilenbasamak;

import java.util.Scanner;

public class SeçilenBasamak {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("payı giriniz ");
        int a = input.nextInt();
        System.out.println("paydayı giriniz ");
        int b = input.nextInt();
        System.out.println("bölümün kaçıncı basamağının değerinin yazdırılmasını istiyorsunuz??? ");
        int n = input.nextInt();
        int c = a / b;
        int k = 0;
        for (int i = 1; n >= i; i++) {

            k = c % 10;
            c = c / 10;

        }
        System.out.println(k);

    }

}
