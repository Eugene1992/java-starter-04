package hw4;

import java.util.Scanner;

/**
 * Created by User on 08.05.2016.
 */
public class Hw4T10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int b = scan.nextInt();
        if (b < 0) {
            System.out.println("Введите натуральное число!");
        }
        if (b == 0) {
            System.out.println("Введите натуральное число!");
        } else {
            System.out.println("Положительные делители числа:");
            for (int i = b; i > 0; i--) {
                int d = b % i;
                if (d == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

