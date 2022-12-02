package kareüçgenselsayılar;

import java.util.Scanner;

public class Kareüçgenselsayılar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("terim sayısını giriniz.");
        int n = input.nextInt();
        int k0 = 0, k1 = 1;
        System.out.print(k1+",");
        for (int i = 1; i <= n-1; i++) {
            int k2 = 34*k1-k0+2;
            System.out.print(k2+",");
            k0 = k1;
            k1 = k2;
            
        }
    }

}
