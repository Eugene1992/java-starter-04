package hw5;

import java.util.Scanner;

/**
 * Created by User on 28.04.2016.
 */
public class Hw5T1 {
    public static void main(String[] args) {
        //1. Вывести в консоль все парные числа одномерного массива
        int[] a = new int[]{10, 5, 20, 3};
        for (int i = 0; i < a.length; i++) {
            if ((a[i] % 2) == 0) {
                System.out.println(a[i] + "");
            }
        }
    }
}


