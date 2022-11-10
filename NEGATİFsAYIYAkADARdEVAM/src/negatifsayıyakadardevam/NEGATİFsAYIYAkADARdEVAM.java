      
 // NEGATİF BİR SAYI GİRİLENE KADAR KULLANICIDAN DEĞER ALMAYA DEVAM EDEN VE 
 // GİRİLEN DEĞERLER ARASINDAN TEK SAYILARIN TOPLAMINI YAZDIRAN PUROGRAM
 

package negatifsayıyakadardevam;

import java.util.Scanner;
public class NEGATİFsAYIYAkADARdEVAM {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        System.out.println("bir a değeri giriniz");
        int a = input.nextInt();
        int b =0;
        
        while (a>=0){
          if(a%2!=0){
              b=b+a;
          }
              System.out.println("başka bir a değeri giriniz");          
          
              a= input.nextInt();
        
        
        
        
        }
        System.out.println(b);
    }
    
}
