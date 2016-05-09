package hw4;

import java.util.Scanner;

/**
 * Created by User on 22.04.2016.
 */
public class Hw4T9Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число для вычесление факториала : ");
        int b = scan.nextInt();
        int a = 1;
        if (b < 0) {
            System.out.println("Введите положительное число!");
        }
        if (b == 0) {
            System.out.println("Факториал нуля равен единице");
        } else {
            for (int c = 1; c <= b; c++) {
                a = a * c;
            }
            System.out.println("Факториал числа " + b + " равен " + a);
        }
    }
}
