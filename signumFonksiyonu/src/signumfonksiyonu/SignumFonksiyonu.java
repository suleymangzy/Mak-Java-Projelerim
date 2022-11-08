/*
 1. başla
 2. x değerini giriniz
 3. foknksyonu tanımlayanız 
 4. girilen x değerlerine göre fonk 'un poziti,negetif,kökünü  yazdırınız
 5. bitir
 */
// KULLANICI TARAFINDAN GİRİLEN X DEĞERİNE GÖRE SİGNUM FONKSİYONUN POZİTİ,NEGATİF 
// VEYA SIFIR DEĞERLERİNİ ALIP ALMADIĞINI BULAN PROGRAM

package signumfonksiyonu;

import java.util.Scanner;
public class SignumFonksiyonu {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("x değerini gir");
        int x = input.nextInt();
        double y = Math.pow(x, 2)-5*x+3;
        
      if (y>0){
          System.out.println("fonk pozitif");
      } else if (y<0){
          System.out.println("fonk negatif");
      } else{
          System.out.println("fonk sıfıra eşit");
      }
      
    }
    
}
