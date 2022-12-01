package eksiksayı;

import java.util.Scanner;

public class Eksiksayı {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz.");
        int s = input.nextInt();
        int t = 0;
        for (int i = 1; i <= s; i++) {
            if (s % i == 0) {
                t+=i;

            }
        }
        if (t<2*s) {
            System.out.println("eksik sayıdır ve eksiklik miktarı:\t"+(2*s-t));
        }else{
            System.out.println("eksiksayı değildir.");
        }
    }

}
