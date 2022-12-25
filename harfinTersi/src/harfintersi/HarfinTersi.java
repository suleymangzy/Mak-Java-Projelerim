
package harfintersi;

import java.util.Scanner;
public class HarfinTersi {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İçerisindeki harfler rasgele büyük veya küçük olan bir ifade girinz.");
        String txt = input.nextLine();
        for (int i = 0; i < txt.length(); i++) {
            if (((int)txt.charAt(i)>=65) && ((int) txt.charAt(i)<=90)) {
                System.out.print((char)(((int) txt.charAt(i))+32));
            }else{
             System.out.print((char)(((int) txt.charAt(i))-32));
            }
        }
    }
    
}
