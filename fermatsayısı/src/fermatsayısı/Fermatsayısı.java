
package fermatsayısı;

import java.util.Scanner;
public class Fermatsayısı {

  
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("terim sayısnı giriniz.");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print((int)(Math.pow(2,Math.pow(2, i))+1)+",");  
        }
    }
    
}
