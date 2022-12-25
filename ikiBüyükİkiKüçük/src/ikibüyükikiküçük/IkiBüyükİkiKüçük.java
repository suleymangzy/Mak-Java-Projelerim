package ikibüyükikiküçük;

import java.util.Scanner;

public class IkiBüyükİkiKüçük {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tamamı küçük harflerden oluşan bir ifade giriniz.");
        String txt = input.nextLine();
        int s = 0;
        for (int i = 0; i < txt.length(); i++) {
            int r = s % 4;
            if (r < 2) {
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            } else {
                System.out.print(Character.toLowerCase(txt.charAt(i)));
            }
            s++;
        }

    }

}
