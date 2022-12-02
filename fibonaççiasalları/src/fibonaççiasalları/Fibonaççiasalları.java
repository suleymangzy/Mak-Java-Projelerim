package fibonaççiasalları;

import java.util.Scanner;

public class Fibonaççiasalları {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("terim sayısını giriniz.");
        int x = input.nextInt();
        int f1 = 1, f2 = 1, s2 = 0;
     do{
       int f3 = f1 + f2;
        f1 = f2;
        f2 = f3;
       int s1 =0;
        for (int i = 2; i < f3-1; i++) {
            if (f3%i==0) {
              s1++;  
            }
       }
        if (s1==0) {
            s2++;
            System.out.print(f3+",");
        }
     }while(s2<x);
     }

}
