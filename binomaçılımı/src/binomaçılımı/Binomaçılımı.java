
package binomaçılımı;

import java.util.Scanner;
public class Binomaçılımı {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("x değerini giriniz");
    int x = input.nextInt();
        System.out.println("n değerini giriniz");
    int n =  input.nextInt();
    int b, sonuc;
    b = 1+x/n;
   sonuc = (int) Math.pow(b, n);
        System.out.println("Sonuç:\t"+sonuc);
    }
    
}
