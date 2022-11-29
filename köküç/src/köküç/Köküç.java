
package köküç;

import java.util.Scanner;
public class Köküç {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("bölüm sayısını giriniz.");
        int n = input.nextInt();
        int t = 1;
        for (int i = 1; i <= n-1; i++) {
            t = 1+1/(2+1/t);
        }
        System.out.println("sonuç:\t"+(1+1/t));
    }
    
}
