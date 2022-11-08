//ÇARPMA İŞARETİ KULLNMADAN DÖNGÜ İLE İKİ SAYININ ÇARPIMI


package çarpım;


import java.util.Scanner;


public class Çarpım {

    
    public static void main(String[] args) {
        
   Scanner input = new Scanner(System.in);
   int A,B,çarpım;
        System.out.println("İlk sayıyı giriniz."); 
        A = input.nextInt();
    System.out.println("İkinci sayıyı giriniz."); 
        B = input.nextInt();
    çarpım = 0;
    while (0 < B){
    çarpım = çarpım + A;
    B = B-1;
    }
        System.out.println("ÇARPIM SONUCU :" + çarpım);
    }
    
}
