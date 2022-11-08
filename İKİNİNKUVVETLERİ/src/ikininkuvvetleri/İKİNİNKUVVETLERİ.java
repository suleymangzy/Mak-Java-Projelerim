 //GİRİLEN SAYIYA KADAR OLAN 2'NİN KUVVETLERİNİ YAZDIRAN PROGRAM
package ikininkuvvetleri;

import java.util.Scanner;

public class İKİNİNKUVVETLERİ {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("bir sayı giriniz");
        int x = input.nextInt();
        int k = 0;
        for (int i = 0; i < x; i++) {
            if (k < x) {
                for (int j = 0; j <= i; j++) {
                    k = (int) Math.pow(2, j);

                }
                System.out.println(k);
            }

        }

    }

}
