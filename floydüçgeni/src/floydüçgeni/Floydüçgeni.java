
package floydüçgeni;

import java.util.Scanner;
public class Floydüçgeni {

   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("satır sayısını giriniz.");
        int x = input.nextInt();
        System.out.println("FLOYD ÜÇGENİ");
        int s = 1;
        for (int i = 1; i <=x ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(s+",");
                s++;
            }
            System.out.println(" ");
        }
    }
    
}
