package hw3;

import java.util.Scanner;

/**
 * Created by User on 21.04.2016.
 */
public class Hw3 {
    public static void main(String[] args) {
        //2
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (i % 2 == 0) {
            System.out.println("Вы ввели чётное число");
        } else {
            System.out.println("Вы ввели нечётное число");
        }
        //3
        Scanner scan1 = new Scanner(System.in);
        int i1 = scan1.nextInt();
        int i2 = scan1.nextInt();
        int i3 = 10;
        if (i1 > i2 && i1 <= i3) {
            System.out.println("Число " + i1 + " ближе к 10");
        }
        if (i1 > i2 && i1 > i3) {
            System.out.println("Число " + i2 + " ближе к 10");
        }
        if (i1 < i2 && i1 < i3) {
            System.out.println("Число " + i2 + " ближе к 10");
        }
        if (i1 < i2 && i1 >= i3) {
            System.out.println("Число " + i1 + " ближе к 10");
        }
        if (i1 == i2) {
            System.out.println("Оба числа ближе к 10");
        }
        //4
        int a = 7;
        int a1 = 77;
        int a2 = 52;
        if (a > a1 && a > a2) {
            if (a1 <= a && a2 <= a)
                System.out.println(a);
        }
        if (a1 > a && a1 > a2) {
            if (a <= a1 && a2 <= a1)
                System.out.println(a1);
        }
        if (a2 > a && a2 > a1) {
            if (a <= a2 && a1 <= a2)
                System.out.println(a2);
        }
        //5
        int b1 = 20;
        int a4 = 25;
        int c1 = 100;
        int d1 = 44;
        if (b1 > a4 & b1 > d1 & b1 < c1) {
            System.out.println(b1);
        }
        if (b1 > a4 & b1 > c1 & b1 < d1) {
            System.out.println(b1);
        }
        if (b1 > c1 & b1 > d1 & b1 < a4) {
            System.out.println(b1);
        }
        if (a4 > b1 & a4 > d1 & a4 < c1) {
            System.out.println(a4);
        }
        if (a4 > b1 & a4 > c1 & a4 < d1) {
            System.out.println(a4);
        }
        if (a4 > c1 & a4 > d1 & a4 < b1) {
            System.out.println(a4);
        }
        if (c1 > b1 & c1 > d1 & c1 < a4) {
            System.out.println(c1);
        }
        if (c1 > b1 & c1 > a4 & c1 < d1) {
            System.out.println(c1);
        }
        if (c1 > a4 & c1 > d1 & c1 < b1) {
            System.out.println(c1);
        }
        if (d1 > b1 & d1 > a4 & d1 < c1) {
            System.out.println(d1);
        }
        if (d1 > b1 & d1 > c1 & d1 < a4) {
            System.out.println(d1);
        }
        if (d1 > c1 & d1 > a4 & d1 < b1) {
            System.out.println(d1);
        }
//6
        float q = 50;
        float b = 50;
        float c = 2;
        float x1;
        float x2;
        float x3;

        double d = (b * b) - (4 * q * c);
        System.out.println(d);
        if (d == 0) {
            System.out.println("Квадратное уровнение имеет один корень!");
            x1 = (b * (-1)) / (q * 2);
            System.out.println("Корень уровнения равен " + x1);
        }
        if (d > 0) {
            System.out.println("Уровнение имеет два вещественых корня");
            x3 = (float) Math.sqrt(d);
            x1 = (((b * (-1)) + (x3)) / (2 * q));
            x2 = (((b * (-1)) - (x3)) / (2 * q));
            System.out.println("Первый корень " + x1 + ",второй корень " + x2);
        }
        if (d < 0) {
            System.out.println("Уравнение не имеет вещественных корней!Потому что число " + d + " меньше нуля");
        }
    }
}















