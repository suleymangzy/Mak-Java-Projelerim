package seslidensesizdenkelime;

import java.util.Scanner;

public class SeslidenSesizdenKelime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tamamı küçük harflerden oluşan bir ifade giriniz.");
        String k = input.nextLine();
        char[] sesli = {'a', 'e', 'i', 'o', 'u'};
        int x = 0;
        for (int i = 0; i < k.length(); i++) {
            for (int j = 0; j < sesli.length; j++) {
                if (sesli[j] == k.charAt(i)) {
                    x++;
                }
            }
        }
        System.out.println("Sesli harf sayısı: " + x);
        System.out.println("Sessiz harf sayısı: " + (k.length() - x));

        char[] k1 = new char[x];
        char[] k2 = new char[k.length() - x];
        int sk1 = 0, sk2 = 0;
        for (int i = 0; i < k.length(); i++) {
            int s = 0;
            for (int j = 0; j < sesli.length; j++) {
                if (k.charAt(i) == sesli[j]) {
                    s = 1;
                }
            }
            if (s == 1) {
                k1[sk1] = k.charAt(i);
                sk1++;
            } else if (s == 0) {
                k2[sk2] = k.charAt(i);
                sk2++;
            }
        }
        for (int i = 0; i < k1.length; i++) {
            System.out.print("Sesli harflerle kelime : " + k1[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < k2.length; i++) {
            System.out.print("Sesiz harflerle kelime : " + k2[i]);
        }
    }

}
