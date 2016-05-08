package hw4;

/**
 * Created by User on 07.05.2016.
 */
public class Hw4T4 {
    public static void main(String[] args) {
        //Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
        int c = 20;
        for (int i = 2; i < 1048577; i = i * 2) {
            System.out.println(i);
        }
    }
}
