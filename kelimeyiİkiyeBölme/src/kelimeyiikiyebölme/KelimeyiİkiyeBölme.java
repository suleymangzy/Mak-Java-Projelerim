
package kelimeyiikiyebölme;

import java.util.Scanner;
public class KelimeyiİkiyeBölme {

   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Bir ifade giriniz.");
        String txt = input.nextLine();
        int n = txt.length()/2;  
        for (int i = 0; i < n; i++) {
            System.out.print( txt.charAt(n+i));
            System.out.print( txt.charAt(n-1-i));
        }
   
}
    
}
