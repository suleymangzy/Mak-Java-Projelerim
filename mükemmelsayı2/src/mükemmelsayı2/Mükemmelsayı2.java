
package mükemmelsayı2;

import java.util.Scanner;
public class Mükemmelsayı2 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("üst sınırı giriniz.");
        int n = input.nextInt();
        System.out.print("Mükemmel sayılar: ");
        int sayac;
        for (int i = 2; i <= num; i++) {
            int islem = (int) (Math.pow(2, i) - 1);
            sayac = 0;
            for (int j = 1; j <= islem; j++) {
                if (islem % j == 0) {
                    sayac++;
                }
            }
            if (sayac == 2) {
                System.out.print((int)(Math.pow(2, i - 1) * (Math.pow(2, i) - 1))+",");
            }
        }
    
    }
    
}
