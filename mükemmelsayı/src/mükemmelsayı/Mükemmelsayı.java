
package mükemmelsayı;

import java.util.Scanner;
public class Mükemmelsayı {

   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz.");
        int s = input.nextInt();
        int t = 0;
        for (int i = 1; i <= s-1; i++) {
            if (s%i==0) {
                t+=i;
            }
        }
        if (s==t) {
            System.out.println("mükemmel sayıdır.");
        }else{
            System.out.println("mükemmel sayı değildir.");
        }
    }
    
}
