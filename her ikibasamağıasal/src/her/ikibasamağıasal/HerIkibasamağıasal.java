
package her.ikibasamağıasal;


public class HerIkibasamağıasal {

   
    public static void main(String[] args) {
        for (int i = 2; i <= 7; i++) {
            for (int j = 2; j <= 7; j++) {
                if ((i==2 || i==3 || i==5 || i==7) && (j==2 || j==3 || j==5 || j==7)) {
                    System.out.print((10*i+j)+",");
                }
            }
        }
    }
    
}
