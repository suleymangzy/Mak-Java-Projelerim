package öncesisonrasıfibonaççi;

import java.util.Scanner;

public class Öncesisonrasıfibonaççi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("büyük değere sahip bir fibonaççi sayısı giriniz.");
        int f2 = input.nextInt();
        double ao = (1 + Math.pow(5, .5)) / 2;
        int f1 = (int) (f2 / ao);
        int f3 = (int) (f2 * ao);
        System.out.println(f1+","+f2+","+f3);
    }

}
