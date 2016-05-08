package hw4;

import java.util.Scanner;

/**
 * Created by User on 24.04.2016.
 */
public class Hw3Calculator {
    public static void main(String[] args) {
        int q;
        System.out.print("Введите первое число: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Введите второе число: ");
        Scanner scan1 = new Scanner(System.in);
        int b = scan1.nextInt();
        System.out.println("Выберите знак для арифметической операции: ");
        Scanner scan2 = new Scanner(System.in);
        String s = scan2.next();
        switch (b) {
            case 0:
                System.out.println("Это невозможно!");
        }
        switch (s) {
            case "+":
                q = a + b;
                System.out.println(a + " + " + b + " = " + q);
                break;
            case "-":
                q = a - b;
                System.out.println(a + " - " + b + " = " + q);
                break;
            case "*":
                q = a * b;
                System.out.println(a + " * " + b + " = " + q);
                break;
            case "/":
                q = a / b;
                System.out.println(a + " / " + b + " = " + q);
                break;
        }
        switch (a) {
            case 0:
                System.out.println("Ошибка!На ноль не интересно");
                break;
        }
    }
}


