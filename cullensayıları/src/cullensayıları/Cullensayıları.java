
package cullensayıları;

import java.util.Scanner;
public class Cullensayıları {

  
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("terim sayını giriniz.");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print( (int)Math.pow(i*2, i+1)+"," );
        }
                
    }
    
}
