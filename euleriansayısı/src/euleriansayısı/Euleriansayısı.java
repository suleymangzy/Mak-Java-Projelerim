
package euleriansayısı;

import java.util.Scanner;
public class Euleriansayısı {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("m değerini giriniz.");
        int m = input.nextInt();
         System.out.println("n değerini giriniz.");
        int n = input.nextInt();
        int a = n+1;
        int t =(int) Math.pow(a, m);
        
        for (int i = 1; i <= n; i++) {
            int f1 =1,f2=1,f3=1;
            for (int k = 1; k <= m+1; k++) {
                f1*=k;
            }
            for (int k = 1; k <= i; k++) {
                f2*=k;
            }
            for (int k = 1; k < m+1-i; k++) {
                f3*=k;
            }
            int c =f1/(f2*f3);
            t =(int) (t+Math.pow(-1, i)*c*Math.pow(n+1-i, m));
        }
   
        System.out.println("sonuç:\t"+t);
    }
    
}
