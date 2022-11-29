
package altınoran;

import java.util.Scanner;
public class Altınoran {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("doğrunun uzunluığunu giriniz.");
        int ab = input.nextInt();
        int cb = (int) (2*ab/(1+Math.pow(5, 0.5)));
        int ac = ab-cb;
        System.out.println(ac+","+cb);
    }
    
}
