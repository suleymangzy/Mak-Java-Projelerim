
package chenasalı;

import java.util.Scanner;
public class Chenasalı {

   
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        int sayac = 0;
        int sayac2  = 0;
        
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayidir.");
        }
        
    for(int i = 2; i < (sayi+2); i++)
        {
            if(sayi % i == 0) {
                sayac2++;
            }
        }
        if (sayac==0 && sayac2==0) {
            System.out.println("chen asalı");
        }else{
            System.out.println("değil");
        
        }
    
    
   
    
    
    }
    
}
