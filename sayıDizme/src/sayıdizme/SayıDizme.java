// DEĞERLERİ GİRİLEN ÜÇ SAYIYI BÜYÜKTEN KÜÇÜĞE DOĞRU SIRALAYAN PROGRAM


package sayıdizme;


import java.util.Scanner;

public class SayıDizme {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("İlk sayıyı giriniz.");
        a = input.nextInt();
        System.out.println("İkinci sayıyı giriniz.");
        b = input.nextInt();
        System.out.println("Üçüncü sayıyı giriniz.");
        c = input.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("İlk sayı > İkinci sayı > Üçüncü sayı");
            } else {
                System.out.println("İlk sayı > Üçüncü sayı > İkinci sayı");
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("İkinci sayı > İlk sayı > Üçüncü sayı");
            } else {
                System.out.println("İkinci sayı > Üçüncü sayı > İlk sayı");
            }
        } else if (c > a && c > b) {
            if (a > b) {
                System.out.println("Üçüncü sayı > İlk sayı > İkinci sayı");
            } else {
                System.out.println("Üçüncü sayı > İkinci sayı > İlk sayı");
            }
        }

    }
}
