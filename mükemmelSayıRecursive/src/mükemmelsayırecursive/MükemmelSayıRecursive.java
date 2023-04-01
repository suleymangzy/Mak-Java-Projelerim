package mükemmelsayırecursive;

import java.util.Scanner;

public class MükemmelSayıRecursive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int num = input.nextInt();
        int bölümToplam = mükemmelSayıRecursive(num, 0, 1);
        mükemmel(num, bölümToplam);
    }

    public static void mükemmel(int num, int sum) {
        if (num == sum) {
            System.out.println("Mükemmel sayı...");
        } else {
            System.out.println("Değil...");
        }
    }

    public static int mükemmelSayıRecursive(int num, int sum, int i) {
        if (num % i == 0 && num > i) {
            int yenisum = sum + i;
            int yenii = i + 1;
            return mükemmelSayıRecursive(num, yenisum, yenii);
        } else if (num > i) {
            int yenii2 = i + 1;
            return mükemmelSayıRecursive(num, sum, yenii2);
        } else {
            return sum;
            
        }
    }
}
