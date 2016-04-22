import java.util.Scanner;

/**
 * Created by Max on 21.04.2016.
 */
public class hm3 {
    public static void main(String[] args) {
       /* int num;
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if ( num % 2 == 0 )
        System.out.println("Число четное");
        else
            System.out.println("Число нечетное");*/
       /* int a = 10;
        int b;
        int c;
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        b = input.nextInt();
        c = input.nextInt();
        if (((a == b) && (a > b)) && ((a == c) && (a > b))) {
            System.out.println("Число" + " " + b + " " + "Ближе к а ");
        }
        else System.out.println("Число" + " " + c + " " + "Ближе к а ");

*/
        /*int x=5, y=4, z=3;
        Scanner input = new Scanner(System.in);

        if (x>y){
            if (x>z){
                System.out.println("larger is x");
            }
            else{
                if(z>y){
                    System.out.println("larger is z");
                }
                else{
                    System.out.println("larger is y");
                }
            }
        }
        else{
            if (y>z){
                System.out.println("larger is y");*/

       /* int res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int n1 = sc.nextInt();
        System.out.println("Введите второе число:");
        int n2 = sc.nextInt();
        System.out.println("Введите знак операции:");
        String op = sc.next();
        sc.close();

        if (op.equals("+")) {
            res = n1 + n2;

        } else if (op.equals("-")) {
            res = n1 - n2;

        } else if (op.equals("*")) {
            res = n1 * n2;

        } else if (op.equals("/")) {
            res = n1 / n2;

        }
        System.out.println(res);*/
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        int b = scan1.nextInt();
        int c= 10;
        if (a > b && a <= c) {
            System.out.println("Число " + a + " ближе к 10");
        }
        if (a > b && a > c) {
            System.out.println("Число " + b + " ближе к 10");
        }
        if (a < b && a < c) {
            System.out.println("Число " + b + " ближе к 10");
        }
        if (a < b && a >= c) {
            System.out.println("Число " + a + " ближе к 10");
        }
        if (a == b) {
            System.out.println("Оба числа ближе к 10");
        }
            }
        }



