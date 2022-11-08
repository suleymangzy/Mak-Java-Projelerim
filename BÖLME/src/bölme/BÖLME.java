// BÖLME İŞARETİ KULLANMADAN KULLANICI TARAFINDAN GİRİLEN İKİ DEĞERİ BÇLRN PROGRAM
package bölme;

import java.util.Scanner;
public class BÖLME {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a,b,i;
       
       System.out.println("pay değerini giriniz");
   a = input.nextInt();
     System.out.println("payda değerini giriniz");
   b = input.nextInt();
    /*
        for ( i = 0; 0 < (a/b); i++) {
            a-=b;
        }
        System.out.println("sonuç:"+i);
   */
i=0;
    while(a/b>0){
a-=b;
i++;

}
        System.out.println("sonuç:"+i);

}
    
}
