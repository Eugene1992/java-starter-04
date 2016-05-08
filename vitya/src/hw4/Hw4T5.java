package hw4;

/**
 * Created by User on 07.05.2016.
 */
public class Hw4T5 {
    public static void main(String[] args) {
        //5. Выведите на экран первые 20 членов последовательности Фибоначчи.
        int a = 0;
        for (int i = 1; i < 7000; i = i + a) {
            a += i;
            System.out.println(i);
            System.out.println(a);
        }
    }
}

