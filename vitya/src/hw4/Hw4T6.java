package hw4;

import java.util.Scanner;

/**
 * Created by User on 24.04.2016.
 */
public class Hw4T6 {
    public static void main(String[] args) {
        //6. Написать программу, которая реализует следующий функционал:
        //6.1 Пользователь вводит число в 10-ой системе счисления.
        //6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
        //1) в 2-ую
        //2) в 8-ую
        //3) в 16-ую
        //6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
        //на экран результат.

        Scanner a1 = new Scanner(System.in);
        System.out.print("Введите число в десятинной системе : ");
        int a = a1.nextInt();
        System.out.println("Выберите в какую систему перевести число:");
        System.out.println("1)2-ю");
        System.out.println("2)8-ю");
        System.out.println("3)16-ю");
        Scanner b1 = new Scanner(System.in);
        int b = b1.nextInt();

        switch (b) {
            case 1:
                b = 1;
                System.out.println("Вы выбрали двоичную систему!");
                int c;
                String num = "";
                while (a != 0) {
                    c = a % 2;
                    num = c + num;
                    a = a / 2;
                }
                System.out.print("Ответ: " + num);
                break;
            case 2:
                b = 2;
                System.out.println("Вы выбрали восьмеричную систему!");
                int c1;
                String num1 = "";
                while (a != 0) {
                    c1 = a % 8;
                    num1 = c1 + num1;
                    a = a / 8;
                }
                System.out.println("Ответ: " + num1);
                break;
            case 3:
                b = 3;
                System.out.println("Вы выбрали шестнадцатеричною систему!");
                int c2;
                String num2 = "";
                while (a != 0) {
                    c2 = a % 16;
                    num2 = c2 + num2;
                    a = a / 16;
                }
                System.out.println("Ответ: " + num2);
                break;
        }
    }
}







