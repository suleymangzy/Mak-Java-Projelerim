package üçvebeşinkatları;

import java.util.Scanner;

public class Üçvebeşinkatları {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("7'den büyük bir tam sayı giriniz.");
        int x = input.nextInt();
        int a, b;
        for (a = 0; a < x; a++) {
            for (b = 0; b < x; b++) {
                if (x == (3 * a + 5 * b)) {
                    System.out.println(a + "," + b);
                }
            }
        }

    }

}
