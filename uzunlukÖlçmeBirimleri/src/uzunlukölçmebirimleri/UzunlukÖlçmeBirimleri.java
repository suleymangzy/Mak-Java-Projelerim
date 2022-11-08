
// METRE CİNSİNDEN GİRİLEN BİR DEĞERİ İSTENİLEN BİR UZUNLUK BİRİMİNE ÇEVİREN PUROGRAM

/*
 1.başla
 2.metre cinsinden bir değer gir
 3.istediğniz uzunluk birimini seçiniz
 4.yazdır
 5.bitir
 */
package uzunlukölçmebirimleri;

import java.util.Scanner;
public class UzunlukÖlçmeBirimleri {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("metre cinsinden bir değer giriniz");
       double m = input.nextDouble();
        System.out.println("çevimek istediğiniz ölçü birimini seçiniz:\n1-cm\n2-mm\n3-dm\n4-km");
        int secim =input.nextInt();
       
       switch (secim){
           case 1 :
               System.out.println(m*100 +"cm");
               break;
       case 2:
               System.out.println(m*1000 +"mm");
               break;
       case 3 :
               System.out.println(m*10 +"dm");
               break;
       
       case 4:
               System.out.println(m/1000 +"km");
               break;
       
       default:
           System.out.println("amına koduğumun naili");
       
       }
       
       
       
       
       
    }
    
}
