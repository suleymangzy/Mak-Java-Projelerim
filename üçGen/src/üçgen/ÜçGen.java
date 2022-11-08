
// KULLANICI TARAFINDAN KENAR UZUNLUKLARI GİRİLEN ÜÇGENİN TİPİNİ İFADE EDEN PUROGRAM

package üçgen;


import java.util.Scanner;
public class ÜçGen {

   
    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);
        int kenar1,kenar2,kenar3;
                 System.out.println("Üçgenin 1.kenar uzunluğunu giriniz.");
            kenar1 = input.nextInt();
                 System.out.println("Üçgenin 2.kenar uzunluğunu giriniz.");
            kenar2 = input.nextInt();
                 System.out.println("Üçgenin 3.kenar uzunluğunu giriniz.");
            kenar3 = input.nextInt();
    
      if (kenar1==kenar2 && kenar2 == kenar3){
          System.out.println("EŞKENAR ÜÇGEN");
     } else if ((kenar1 != kenar2 && kenar1 == kenar3) ||
             (kenar1 == kenar2 && kenar1 != kenar3) ||
             (kenar2 == kenar3 && kenar2 != kenar1)) {
          System.out.println("İKİZKENAR ÜÇGEN");
     } else {
          System.out.println("ÇEŞİTKENAR ÜÇGEN");
     }
     
    
    
    
    
    
    }
    
}
