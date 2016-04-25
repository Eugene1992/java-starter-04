package hw4;

/**
 * Created by User on 22.04.2016.
 */
public class hw4task5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        do {
            System.out.println(a);
            System.out.println(b);
            a = a + b;
            b = b + a;
        } while (a < 6766 & b < 6766);

    }
}
