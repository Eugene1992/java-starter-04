/**
 * Created by notebook on 22.04.2016.
 */
public class hw04 {
    public static void main(String[] args) {
        int i = 1000;
        for (i = 1000; i < 10000; i += 3) {
            System.out.println(i);

        }
    }
}


class hw04_2 {
    public static void main(String[] args) {
        int a = 1;
        for (a = 1; a <= 109; a += 2) {
            System.out.println(a);

        }
    }
}


class hw04_3 {
    public static void main(String[] args) {
        int b = 90;
        for (b = 90; b >= 0; b -= 5) {
            System.out.println(b);

        }
    }
}


class hw04_4 {
    public static void main(String[] args) {
        int a = 2;
        for (a = 2; a <= 1048576; a *= 2) {
            System.out.println(a);

        }
    }
}

class hw04_5 {
    public static void main(String[] args) {
        int a = 0;
        int c = 1;
     for(c = 1; c <= 4181; c = c + a){
         a += c;
         System.out.println(c);
         System.out.println(a);
     }
    }
}