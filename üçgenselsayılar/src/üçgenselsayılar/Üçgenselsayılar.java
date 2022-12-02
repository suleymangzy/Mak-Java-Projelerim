
package üçgenselsayılar;

import java.util.Scanner;
public class Üçgenselsayılar {

   
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        System.out.println("terim sayısını giriniz.");
        int n = input.nextInt();
        for (int i = 1; i <=n; i++) {
            int u =i*(i+1)/2;
            System.out.print(u+",");
        }
       
    }
    
}
