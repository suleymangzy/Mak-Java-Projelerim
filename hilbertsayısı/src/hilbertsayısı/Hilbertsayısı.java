
package hilbertsayısı;

import java.util.Scanner;
public class Hilbertsayısı {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pozitif bir tamsayı giriniz.");
        int s = input.nextInt();
        if ((s-1)%4==0) {
            System.out.println("hilbert sayısıdır.");
        }else{
            System.out.println("hilbert sayısı değildir.");
        }
    }
    
}
