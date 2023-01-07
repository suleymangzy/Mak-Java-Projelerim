
package metotyıldız;

import java.util.Scanner;
public class MetotYıldız {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz.");
        int n = input.nextInt();
        yıldız(n);
    }
    public static void yıldız(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
