package ikiboyutludizisirket;

import java.util.Scanner;
import java.util.Random;

public class IkiBoyutluDİziSirket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rastgele = new Random();
        System.out.println("şirket sayısını giriniz.");
        int n = input.nextInt();
        int[][] a = new int[n][12];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 12; j++) {
                a[i][j] = rastgele.nextInt(1000000);
                System.out.println((i + 1) + " inci şirketin " + (j + 1) + " inci aydaki kazancı:" + a[i][j]);
            }
        }
        for (int i = 0; i < n; i++) {
            int b = 0;
            for (int j = 0; j < 12; j++) {
                b += a[i][j];
            }
            System.out.println((i + 1) + " inci şirketin yıllık ortalama kazancı: " + (b / 12));
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            int enyk = a[i][0], endk = a[i][0];
            int enyay = 0, enday = 0;
            for (int j = 0; j < 12; j++) {
                if (a[i][j] > enyk) {
                    enyk = a[i][j];
                    enyay = j;
                }
                if (a[i][j] < endk) {
                    endk = a[i][j];
                    enday = j;
                }
            }
            System.out.println((i + 1)+" inci şirketin en yüksek kazancını yılın "+(enyay+1)+" inci ayında "+enyk+" olarak yapmıştır.");
            System.out.println((i + 1)+" inci şirketin en düşük kazancını yılın "+(enday+1)+" inci ayında "+endk+" olarak yapmıştır.");
        }
        for (int i = 0; i < 12; i++) {
            int enfksay = a[0][i];
            int enaksay = a[0][i];
            int enfkay = 0, enakay = 0;
            for (int j = 0; j < n; j++) {
                if (enfksay < a[j][i]) {
                    enfksay = a[j][i];
                    enfkay = j;
                }
                if (enaksay > a[j][i]) {
                    enaksay = a[j][i];
                    enakay = j;
                }
            }
            System.out.println("yılın "+(i + 1)+" inci ayında en fazla kazancı elde eden şirket "+enfksay+" ile "+(enfkay+1 )+" inci şirkettir.");
            System.out.println("yılın "+(i + 1)+" inci ayında en az kazancı elde eden şirket "+enaksay+" ile "+(enakay+1)+" inci şirkettir.");
        }
    }

}
