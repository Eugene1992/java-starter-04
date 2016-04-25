import java.util.Scanner;

/**
 * Created by notebook on 22.04.2016.
 */
public class Hw03Calculator {
    public static void main(String[] args) {
        int a;
        int b;
        String s;
        System.out.println("Введите первое число.");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        System.out.println("Введите второе число.");
        scan = new Scanner(System.in);
        b = scan.nextInt();
        System.out.println("Введите знак действия.");
        scan = new Scanner(System.in);
        s = scan.next();
        if(s.equals("-")){
            System.out.println(a - b);
        }else if (s.equals("+")){
            System.out.println(a + b);
        }else if (s.equals("*")){
            System.out.println(a * b);
        }else if (s.equals("/")){
            System.out.println(a / b);
        }

    }
}
