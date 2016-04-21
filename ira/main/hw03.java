import java.util.Scanner;

/**
 * Created by notebook on 21.04.2016.
 */
public class hw03 {
    public static void main(String[] args) {
        int a;
        System.out.println("Введите ваше число.");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        if (a%2==0){
            System.out.println("Чётное число.");
        }else{
            System.out.println("Нечётное число.");
        }

    }
}

class hw03_3 {
    public static void main(String[] args) {
        int a;
        int b;
        int i = 10;
        System.out.println("Введите первое число.");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("Введите второе число.");
        in = new Scanner(System.in);
        b = in.nextInt();
        int c = i - a;
        int d = i - b;
        if (c==d){
            System.out.println("Числа "+a+" и "+b+" равноудалены от числа "+i+".");
        }else if (c>d){
            System.out.println("Число "+b+" ближе к "+i+".");
        }else {
            System.out.println("Число "+a+" ближе к "+i+".");
        }

    }
}


class hw03_4 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        System.out.println("Введите первое число.");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("Введите второе число.");
        in = new Scanner(System.in);
        b = in.nextInt();
        System.out.println("Введите третье число.");
        in = new Scanner(System.in);
        c = in.nextInt();
        if (a>b && a>c){
            System.out.println("Максимальное значение имеет число "+a);
        }else if (b>a && b>c){
            System.out.println("Максимальное значение имеет число "+b);
        }else if(c>a && c>b){
            System.out.println("Максимальное значение имеет число "+c);
        } else {
            System.out.println("Ошибка. Введите разные числа. ");
        }
    }
}

