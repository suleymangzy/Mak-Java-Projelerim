
// KULLANICI TARAFINDAN GİRİLEN SAYININ FAKTÖRYELİNİ BULAN PROGRAM

package faktöryel;

import java.util.Scanner;
public class FAKTÖRYEL {

  
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
      
        
        int N, A, faktöryel;
        System.out.println("bir sayı giriniz ");
        N = input.nextInt();
        A = 1;
        faktöryel = 1;

        while (A <= N) {
            faktöryel = faktöryel * A;

            A++;
           
        }
        System.out.println(faktöryel);}
    
}
