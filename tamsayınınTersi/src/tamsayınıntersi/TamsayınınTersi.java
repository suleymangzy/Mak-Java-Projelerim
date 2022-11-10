
//KULLANICI TARAFINDAN GİRİLEN SAYI DEĞERİNİN TERSİNİ YAZDIRAN PUROGRAM
// ÖRNEĞİN: 123 <=> 321


/*
 1.başala
 2.bir tam sayı giriniz
 3.b= 0
 4.a >0 değilse 9'a git
 5.k = a%10
 6.b = b*10+k
 7.a = a/10
 8.4 'e git
 9.b yazdır
 10.bitir
 */
package tamsayınıntersi;

import java.util.Scanner;
public class TamsayınınTersi {

   
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
        System.out.println("a sayısını giriniz");
        int a = input.nextInt();
        int b =0;
        while(a>0){
        int k = a%10;
        b = b*10+k;
        a =a/10;
           
   }
     System.out.println(b);
    
    
    }
    
}
