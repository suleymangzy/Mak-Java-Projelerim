
package kökbeş;

import java.util.Scanner;
public class Kökbeş {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("bölüm sayısını giriniz.");
       int n = input.nextInt();
        int t = 1;
        for (int i = 1; i <= n; i++) {
            t = 4+1/t;
        }
        System.out.println("sonuç:\t"+(2+1/t));
    }
    
}
