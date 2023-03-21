package siralamaalgoritmalari;

import java.util.Scanner;

public class SiralamaAlgoritmalari {

    public static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public static int[] selectionsort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    public static int[] bubblesort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                }
            }
        }
        return array;
    }
/////////////////////////////////////////////////////////// Comb Sorted/////////
    public static int mesafeBelirleme(int mesafe) {
        mesafe = (mesafe * 10) / 13;
        if (mesafe < 1) {
            return 1;
        }
        return mesafe;
    }

    public static int[] combsort(int[] array) {

        int mesafe = mesafeBelirleme(array.length);
        for (int i = mesafe; i > 0; i--) {
            for (int j = 0; j < array.length - mesafe; j++) {
                if (array[j] > array[j + mesafe]) {
                    int tmp = array[j];
                    array[j] = array[j + mesafe];
                    array[j + mesafe] = array[j];
                }
            }
        }
        return array;
    }
////////////////////////////////////////////////////////////////////////////////
    public static int[] insertionsort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int var = array[i];
            int j = i - 1;
            while ((j > -1) && (array[j] > var)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = var;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = {2, 5, 4, 1, 3};

        System.out.print("Selection sorted: ");
        int[] sorted1 = selectionsort(array);
        printarray(sorted1);
        System.out.println(" ");
        System.out.print("Bubble sorted: ");
        int[] sorted2 = bubblesort(array);
        printarray(sorted2);
        System.out.println(" ");
        System.out.print("Comb sorted: ");
        int[] sorted3 = combsort(array);
        printarray(sorted3);
        System.out.println(" ");
        System.out.print("İnsertion sorted: ");
        int[] sorted4 = insertionsort(array);
        printarray(sorted4);
    }

}
