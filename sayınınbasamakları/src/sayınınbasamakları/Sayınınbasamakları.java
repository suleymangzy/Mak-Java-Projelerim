
package sayınınbasamakları;

import java.util.Scanner;
public class Sayınınbasamakları {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a = input.nextInt();
        int i;
        for (i = 0;  0< a; i++) {
            int b = a%10;
            a/=10;
        }
        System.out.println(i);
    }
    
}
