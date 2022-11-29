
package jhonwallis;

import java.util.Scanner;
public class Jhonwallis {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("terim sayısını giriniz.");
        int n = input.nextInt();
        int c = 1;
        for (int k = 1; k <= n; k++) {
            int c1 = 4*k*k;
            c =c*c1/(c1-1);
        }
        System.out.println("sonuç:\t"+(2*c));
    }
    
}
