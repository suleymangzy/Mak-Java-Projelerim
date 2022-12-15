
package fibonaççidizisi;

import java.util.Scanner;
public class Fibonaççidizisi {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        System.out.println("dizinin eleman sayısını giriniz");
        int x = input.nextInt();
        int [] dizi = new int [x];
        dizi[0]=1;
        dizi[1]=1;
        for (int i = 2; i <x; i++) {
            int yeni = dizi[i-1]+dizi[i-2];
            dizi[i]=yeni;
        }
        for (int i = 0; i < x; i++) {
            System.out.print(dizi[i]+",");
        }
    
    }
    
}
