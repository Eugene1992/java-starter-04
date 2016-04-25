/**
 * Created by notebook on 20.04.2016.
 */
public class Hw02 {
    public static void main(String[] args) {
        byte a;
        short b;
        int c;
        long d;

        a = 2+3;
        b = 18-6;
        c = 36/6;
        d = 368*5;

        byte a1 = 7, a2 = 6;
        byte a3 = (byte) (a1 + a2);

        short b1 = 24;
        byte a4 = (byte) ((b+b1)/a3);

        short b2 = (short) (b1/b);
        byte a5 = 10/5;
        int c1 = b2*a5;

        c1 = c1 + c;
        b2 = (short) (b2 * b);

        a = (byte) (a + a1);
        a1 = (byte) (a1 * a);

    }
}

