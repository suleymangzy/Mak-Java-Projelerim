
package hesapmakinesi;


import java.util.Scanner;

public class HesapMakinesi {

    
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        int sayi1, sayi2, secim;
        System.out.println("İlk sayıyı giriniz:");
        sayi1 = scan.nextInt();
        System.out.println("İkinci sayı giriniz:");
        sayi2 = scan.nextInt();
        System.out.println("Yaptirmak istediğiniz islemi seçiniz.");
        System.out.println("\n1- Toplama\n2- Cikarma\n3- Carpma\n4- Bölme");
        System.out.println("Seciminiz:");
        secim = scan.nextInt();

      //SWİTCH CASE İLE  

 /*
    switch (secim) {
        case 1:
    System.out.println("Toplama:" + (sayi1+sayi2));
    break;
        case 2:
    System.out.println("Çıkarma:" + sayi1-sayi2);
    break;
        case 3:
    System.out.println("Çarpma:" + (sayi1*sayi2));
    break;
         case 4:
    System.out.println("Bölme:" + (sayi1/sayi2));
    break;
    default:
    System.out.println(Geçersiz deper girdiniz.);
    }
         
      // İF ELSE İLE

*/
        if (secim == 1) {
            System.out.println("Toplama:" + (sayi1 + sayi2));
        } else if (secim == 2) {
            System.out.println("Çıkarma:" + (sayi1 + sayi2));
        } else if (secim == 3) {
            System.out.println("Çarpma:" + (sayi1 + sayi2));
        } else if (secim == 4) {
            if (sayi2 == 0) {
                System.out.println("İkinci sayı 0' a eşittir ve sonuç belirsizdir.");
            } else {
                System.out.println("Bölme:" + (sayi1 / sayi2));
            }
        }

    }

}
