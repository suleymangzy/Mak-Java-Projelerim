
// KULLANICI TARAFINDAN GİRİLEN SAYIYA KADAR OLAN SAYILARIN KARELERİNİN TOPLAMINI BULAN PROGRAM

package tamsayınınkaresi;


import java.util.Scanner;

public class Tamsayınınkaresi {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
            
   int toplam,A,N;
   System.out.println(" 'N' sayısının değerini giriniz.");
   N = input.nextInt();
   A = 1;
   toplam = 0;
   
   while (A<=N) {
   toplam = toplam + A*A;
    A = A+1;
   }
        System.out.println(toplam);
    
         

      

    }

}
