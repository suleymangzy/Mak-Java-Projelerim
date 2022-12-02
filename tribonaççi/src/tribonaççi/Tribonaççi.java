
package tribonaççi;

import java.util.Scanner;
public class Tribonaççi {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("terim sayısını giriniz.");
   int x = input.nextInt();
    int t1 = 1,t2=1,t3=2;
        System.out.print(t1+","+t2+","+t3+",");
        for (int i = 1; i <= x-3; i++) {
            int t4=t1+t2+t3;
            System.out.print(t4+",");
            t1=t2;
            t2=t3;
            t3=t4;
        }
    
    
    
    
    
    
    }
    
}
