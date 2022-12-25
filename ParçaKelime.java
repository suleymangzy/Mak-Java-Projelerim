
package parçakelime;

import java.util.Scanner;
public class ParçaKelime {

   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Bir ifade giriniz.");
        String  txt = input.nextLine();
        int n = txt.length()/2;
       
        for (int i = n-1 ; i>=0; i--) {
            System.out.print(txt.charAt(i));
        }
    for (int i = txt.length()-1; i >= n; i--) {
            System.out.print(txt.charAt(i));
        }
    }
    
}
