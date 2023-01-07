package ikiboyutluüstsınır;

import java.util.Scanner;
import java.util.Random;

public class IkiBoyutluÜstSınır {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rst = new Random();
        System.out.println("dizinin elelman sayısını giriniz.");
        int n = input.nextInt();
        System.out.println("dizinin elemanlarının alacakları değerlerin üs sınırını giriniz.");
        int x = input.nextInt();
        random(x, n);
    }

    public static void random(int num, int num1) {
        Random rst = new Random();
        int[][] a = new int[num1][num1];
        System.out.print("a dizisinin elemanları: ");
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num1; j++) {
                a[i][j] = rst.nextInt(num);
                System.out.print(a[i][j] + ",");
            }
        }
    }
}
