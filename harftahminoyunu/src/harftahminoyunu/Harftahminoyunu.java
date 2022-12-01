
package harftahminoyunu;
import java.util.Random;
import java.util.Scanner;
public class Harftahminoyunu {

   
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
     Random rastgele =new Random();
       int x = rastgele.nextInt(25)+65;
     char harf = (char)x;
       
     for (int i = 1; i <= 10; i++) {
            System.out.println("tahmininiz:\t");
            char tahmin = scan.next().charAt(0);
            if (tahmin==harf) {
                System.out.println(i+"tahminde doğru harfi buldunuz...");
            }
        }
        System.out.println("10 tahmin hakkınız doldu.");
    
    
    }
    
    
}
