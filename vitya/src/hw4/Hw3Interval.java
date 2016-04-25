package hw4;

import java.util.Scanner;

/**
 * Created by User on 24.04.2016.
 */
public class Hw3Interval {
    public static void main(String[] args) {
        System.out.print("Введите число от 1 до 100 : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a >= 0 & a < 15) {
            System.out.println("Вы попали в интервал [0-14]");
        }
        if (a >= 15 & a < 36) {
            System.out.println("Вы попали в интервал [15-35]");
        }
        if (a >= 36 & a < 51) {
            System.out.println("Вы попали в интервал [36-50]");
        }
        if (a >= 50 & a < 101) {
            System.out.println("Вы попали в интервал [50-100]");
        } else if (a >= 101) {
            System.out.println("Вы ввели неправильное число");
        }


    }
}
