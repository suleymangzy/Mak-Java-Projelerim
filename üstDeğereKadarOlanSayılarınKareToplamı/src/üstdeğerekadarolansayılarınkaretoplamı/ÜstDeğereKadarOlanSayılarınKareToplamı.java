package üstdeğerekadarolansayılarınkaretoplamı;

import java.util.Scanner;

public class ÜstDeğereKadarOlanSayılarınKareToplamı {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("bir sayı giriniz");
        int n = input.nextInt();
        karetoplam(n);
    }

    public static void karetoplam(int num) {
        int t = 0;
        for (int i = 1; i <= num; i++) {
            t += Math.pow(i, 2);
        }
        System.out.println("sonuç: " + t);
    }

}
