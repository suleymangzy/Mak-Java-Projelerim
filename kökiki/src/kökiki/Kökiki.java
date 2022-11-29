
package kökiki;

import java.util.Scanner;
public class Kökiki {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bölüm sayısını girini");
        int n = input.nextInt();
        int t = 1;
        for (int i = 1; i <=n; i++) {
            t=2+1/t;
        }
        System.out.println("sonuç:\t"+(1+1/t));
    }
    
}
