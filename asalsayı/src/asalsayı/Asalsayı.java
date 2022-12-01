
package asalsayı;

import java.util.Scanner;
public class Asalsayı {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("üst sınırı giriniz.");
       int x = input.nextInt();
     
       for (int i = 2; i <=x; i++) {
           int sayac =0;
           for (int j =1; j <=i; j++) {
                if (i%j==0) {
                    sayac++;
                }
               
            }
             if (sayac==2) {
                    System.out.print(i+",");
                }
               
        }
    }
    
}
