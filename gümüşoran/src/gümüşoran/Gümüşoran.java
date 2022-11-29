
package gümüşoran;

import java.util.Scanner;
public class Gümüşoran {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("doğru parçasının uzunluğunu giriniz.");
        int u = input.nextInt();
        int b = (int) (u/(2+Math.pow(2, .5)));
        int a = u-b;
        System.out.println(a+","+b);
    }
    
}
