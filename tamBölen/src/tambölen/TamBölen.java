
/*
1. başla
2. a sayısını giriniz
3. dönbgü içinde {b sayısını tanımla,a>=b,b++}6' ya git
4. koşul (a%b=0) 
5. b yazdır 3 'e git
6. bitir
 */

// KULLNANICI TARAFINDAN GİRİLEN SAYI DEĞERİNİ TAM BÖLEN SAYI DEĞERLERİNİ BULAN PROGRAM


package tambölen;

import java.util.Scanner;
public class TamBölen {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a sayısının değerini giriniz");
        int a = input.nextInt();
        
        for (int b=1;a>=b;b++){
        if (a%b==0){
            System.out.print(b+",");
        }
   
        
        }   
    }
    
}
