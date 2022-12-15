package ebobekok;

import java.util.Scanner;

public class Ebobekok {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz.");
        int x = input.nextInt();
        System.out.println("ikinci sayıyı giriniz.");
        int y = input.nextInt();
        int min = (x < y) ? x : y;
        int ebob = 1, ekok;
        for (int i = min; i > 0; i--) {
            if ((x % i == 0) && (y % i == 0)) {
                ebob = i;
                break;
            }
        }
        ekok = (x * y) / ebob;
        System.out.println(x + "ve" + y + "'nin ebobu:\t" + ebob + "\tekoku:\t" + ekok);
    }

}
