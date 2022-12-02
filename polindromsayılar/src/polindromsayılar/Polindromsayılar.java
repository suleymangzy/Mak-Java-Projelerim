
package polindromsayılar;


public class Polindromsayılar {

   
    public static void main(String[] args) {
        for (int i = 1 ; i<=9 ; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.println((100*i+10*j+i));
            }
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.println((1000*i+100*j+10*j+i));
            }
        }
    }
    
}
