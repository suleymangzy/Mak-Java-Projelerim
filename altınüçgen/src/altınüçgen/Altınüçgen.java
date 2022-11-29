
package altınüçgen;

import java.util.Scanner;
public class Altınüçgen {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("altın üçgenin kısa kenar uzunluğunu giriniz.");
        int a = input.nextInt();
        int b = (int) ((int) a*(1+Math.pow(5, 1/2))/2);
        System.out.println("altın üçgenin kenar uzunlukları:\t"+a+","+b+","+b);
    }
    
}
