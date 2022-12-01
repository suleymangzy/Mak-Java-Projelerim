
package sayıtahminoyunu;

import java.util.Scanner;
public class Sayıtahminoyunu {

  
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int bs = (int) (Math.random()*98)+1;
      int s = 0,tahmin;
       do{
           System.out.println("tahmininiz:\t");
           tahmin = input.nextInt();
           s++;
           if (tahmin>bs) {
               System.out.println("daha küçük bir sayı giriniz...");
               }
           if (tahmin<bs) {
               System.out.println("daha büyük bir sayı giriniz...");
           }
           System.out.println(" ");
       }while(tahmin!=bs);
        System.out.println(s+"\ttahminde doğru sayıyı buldunuz.");
    }
    
}
