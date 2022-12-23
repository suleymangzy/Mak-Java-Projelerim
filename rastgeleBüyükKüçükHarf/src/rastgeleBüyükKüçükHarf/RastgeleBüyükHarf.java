package rastgeleBüyükKüçükHarf;

import java.util.Scanner;
import java.util.Random;

public class RastgeleBüyükHarf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rastgele = new Random();
        System.out.println("Bir ifade giriniz.");
        String x = input.nextLine();
        for (int i = 0; i < x.length(); i++) {
            int n = rastgele.nextInt(10);
            if (n % 2 == 0) {
                System.out.print(Character.toUpperCase(x.charAt(i)));
            } else {
                System.out.print(Character.toLowerCase(x.charAt(i)));

            }
        }
    }

}
