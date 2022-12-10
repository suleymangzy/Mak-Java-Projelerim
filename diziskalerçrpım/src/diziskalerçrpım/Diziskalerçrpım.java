
package diziskalerçrpım;

import java.util.Scanner;
public class Diziskalerçrpım {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("dizilerin eleman sayısını giriniz");
        int n = input.nextInt();
       int [] a = new int [n];
       int [] b = new int [n];
        int sc = 0;
       for (int i = 0; i < n; i++) {
           System.out.println("a dizisinin\t"+(i+1)+"\tinci elemanını giriniz.");
           a[i]= input.nextInt();
           System.out.println("b dizisinin\t"+(i+1)+"\tinci elemanını giriniz.");
           b[i]= input.nextInt();
      }
        for (int i = 0; i <n; i++) {
            sc += a[i]*b[i];
        }
        System.out.println("dizilerin skaler çarpımları sonucu:\t"+sc);
    }
    
}
