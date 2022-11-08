
package uçakbiletihesaplama;


import java.util.Scanner;

public class Uçakbiletihesaplama {

    
    public static void main(String[] args) {
        

        // Km birim fiyatı : 0.10$
        // 12 yaşından küçükse toplam fiyatta %50 indirim
        // 12 ve 24 yaşları arsındaysa %10 indirim
        // 65 yaşından büyükse %30 indirim
        // gidiş dönüş  alırsa %20 indirim
        // Bu koşullara göre uçak bilet fiyatı hesaplıyan program

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz:");
        int km, yas, tip, secim;
        km = input.nextInt();
        System.out.println("Yaşınızı giriniz:");
        yas = input.nextInt();
        System.out.println("Yolculuk tipi  seçiniz "
                + "(1- Tek gidiş\n2- Gidiş dönüş):");
        tip = input.nextInt();
        double normalfiyat = km * 0.10;

        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            System.out.println("Girdiler doğru");
        } else {
            System.out.println("Girdiler yanlış");
        }
        System.out.println("Yaş aralığnızı ve yolculuk tipi kombinasyonunuzu seçiniz\n"
                + " 1-0<yaş<=12,1\n 2-0<yaş<=12,2\n 3-12<yaş<=24,1\n 4-12<yaş<=24,2\n 5-24<yaş<65,1\n 6-24<yaş<65,2\n"
                + " 7-65<=yaş,1\n 8-65<=yaş,2\n");
        System.out.println("Seçiminiz");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Bilet fiyatınız:\t" + normalfiyat / 2);
           break;
            case 2:
                System.out.println("Bilet fiyatınız:\t" + ((normalfiyat / 2) - normalfiyat * 0.2));
           break;
            case 3:
                System.out.println("Bilet fiyatınız:\t" + ((normalfiyat) - normalfiyat * 0.1));
           break;
            case 4:
                System.out.println("Bilet fiyatınız:\t" + ((normalfiyat) - normalfiyat * 0.1 - normalfiyat * 0.2));
           break;
            case 5:
                System.out.println("Bilet fiyatınız:\t" + normalfiyat);
           break;
            case 6:
                System.out.println("Bilet fiyatınız:\t" + (normalfiyat - normalfiyat * 0.2));
           break;
            case 7:
                System.out.println("Bilet fiyatınız:\t" + (normalfiyat * 0.3));
           break;
            case 8:
                System.out.println("Bilet fiyatınız:\t" + (normalfiyat * 0.3 - normalfiyat * 0.2));
           break;
            default:
                System.out.println("Geçersiz bir değer girdiniz!!!");
        }

    }

}
