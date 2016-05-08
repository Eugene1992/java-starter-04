package hw4;

import java.util.Scanner;

/**
 * Created by User on 07.05.2016.
 */
public class Hw4T2 {
    public static void main(String[] args) {
        //2.Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
        // UPGRADE!! Количество элементов можно выбирать самому.
        Scanner b1 = new Scanner(System.in);
        System.out.print("Введите количество элементов которых надо вывести на экран: ");
        int b = b1.nextInt();
        for (int i = 1; i < b * 2; i = i + 2) {
            System.out.println(i);
        }
    }
}
