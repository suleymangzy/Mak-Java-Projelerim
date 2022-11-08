/*
1.başla
2.kümenizin eleman sayısını giriniz
3.eleman sayısını belirttiğiniz kümenin kaçlı kombinasyonlarını almak istediğinizi giriniz
4.BELİRTİLEN KÜMENİN ELEMAN SAYISININFAKTÖRYELİNE EŞİT OLAN BİR DEĞİŞKEN TANIMLA=F1
5.ELEMAN SAYISI BELİRTİLEN KÜMENİN KAÇLI KOMBİSYONLARI ALINMAK İSTENİYORSA 
  ALINMAK İSTENEN KOMBİNASYON SAYISININ FAKTÖRYELİNE EŞİT OLAN BİR DEĞİŞKEN TANIMLA=F2
6.KÜMENİN ELEMAN SAYISI İLE KAÇLI KOMBİNASYONLARININ ALINMASININ İSTENDİĞİNİ İFADE EDEN SAYININ 
  FARKININ FAKTÖRYELİNE EŞİT OLAN BİR DEĞİŞKEN TANIMLA=F3
7.F1/(F2*F3)=K FORMÜLÜNÜ TANIMLA
8.K DEĞERİNİ YAZDIR
9.BİTİR.
 */
package kombinasyon;

import java.util.Scanner;

public class Kombinasyon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kümenizin eleman sayısını giriniz");
        int n = input.nextInt();
        System.out.println("eleman sayısını belirttiğniz küümenin kaçlı kombinasyonlarını almak istediğinizi giriniz");
        int r = input.nextInt();
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;

        for (int a = 1; n >= a; a++) {
            f1 = f1 * a;
        }
        for (int b = 1; r >= b; b++) {
            f2 = f2 * b;
        }
        for (int c = 1; (n - r) >= c; c++) {
            f3 = f3 * c;
        }
        int k = f1 / (f2 * f3);
        System.out.println(n + "\telemanlı kümenizin\t" + r + "\tli kombinasyonu:\t" + k);

    }

}
