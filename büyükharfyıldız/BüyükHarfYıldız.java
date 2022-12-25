
package büyükharfyıldız;

import java.util.Scanner;
public class BüyükHarfYıldız {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tamamı büyük harflerden oluşan bir ifade giriniz.");
        String txt =input.nextLine();
        for (int i = 0; i < txt.length(); i++) {
            System.out.print(txt.charAt(i)+"->");
            for (int j = 0; j < ((int)txt.charAt(i)-64); j++) {
                System.out.print("*");
            }
            System.out.println("    ");
        }
    }
    
}
