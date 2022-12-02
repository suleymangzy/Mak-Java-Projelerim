package aritmetiksayı;

import java.util.Scanner;

public class Aritmetiksayı {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = 0;
        int sayac = 0;
        System.out.println("bir sayı giriniz");
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                b += i;
                sayac++;
            }
        }
        if (b % sayac == 0) {
            System.out.println("aritmetik sayı");

        } else {
            System.out.println("değil");
        }
        
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }

}
