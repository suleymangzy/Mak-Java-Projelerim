
package heterometriksayı;

import java.util.Scanner;
public class Heterometriksayı {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("adet sayısını giriniz.");
        int n = input.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.println((double) (i+i/10)+(1+(i*(i+1))/10));
        }
    }
    
}
