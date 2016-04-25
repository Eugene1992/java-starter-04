import java.util.Scanner;

/**
 * Created by notebook on 21.04.2016.
 */
public class Hw03 {
    /*
    Задание 2
Создать программу, проверяющую и сообщающую на экран, является ли введенное с
консоли целое число, чётным либо нечётным.
     */
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

class Hw03_3 {
    /*
    Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
     */
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


class Hw03_4 {
    /*
    Задано три переменных, найти и вывести на экран переменную с максимальным значением
(значения всех переменных разные).
     */
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

class Hw03_5 {
    /*
    Задано четыре переменных, найти и вывести на экран вторую по величине.
     */
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        System.out.println("Введите 4 разных числа.");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        if (a > b && a > c && a > d && b > c && b > d) {
            System.out.println("Второе по величине число " + b);
        } else if (a > b && a > c && a > d && c > b && c > d) {
            System.out.println("Второе по величине число " + c);
        } else if (a > b && a > c && a > d && d > c && d > b) {
            System.out.println("Второе по величине число " + d);
        } else if (b>a && b>c && b>d && a>c && a>d) {
            System.out.println("Второе по величине число " + a);
        } else if (b>a && b>c && b>d && c>a && c>d) {
            System.out.println("Второе по величине число " + c);
        }else if (b>a && b>c && b>d && d>c && d>a ) {
            System.out.println("Второе по величине число " + d);
        } else if (c>a && c>b && c>d &&a>b && a>d) {
            System.out.println("Второе по величине число " + a);
        } else if (c>a && c>b && c>d && b>a && b>d) {
            System.out.println("Второе по величине число " + b);
        } else if (c>a && c>b && c>d && d>a && d>b) {
            System.out.println("Второе по величине число " + d);
        }else if (d>a && d>b && d>c && a>b && a>c) {
            System.out.println("Второе по величине число " + a);
        } else if (d>a && d>b && d>c && b>a && b>c) {
            System.out.println("Второе по величине число " + c);
        }else if (d>a && d>b && d>c && c>a && c>b) {
            System.out.println("Второе по величине число " +c );
        } else  {
            System.out.println("Неверный ввод. ");

        }
    }
}



class Hw03_6{
    /*
    В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
либо сообщать, что корней нет.
     */
    public static void main(String[] args) {
        String s = "ax²+bx+c=0";
        double a = 11.03;
        double b = 48.36;
        double c = 6.08;
        double n = Math.pow(b,2)- 4*a*c;
        double x1 = (-b-Math.sqrt(n))/2*a;
        double x2 = (-b+Math.sqrt(n))/2*a;
        System.out.println("У квадратного уровнения "+s+" два корня, первый х1 = "+x1+" и х2 = "+x2+".");
    }
}

class Interval{
    /*
    Используя IntelliJ IDEA, создайте класс Interval.
Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
выводится соответствующее сообщение.
     */
    public static void main(String[] args) {
        int i;
        System.out.println("Введите число от 0 до 100.");
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
        if (i >=0 && i <= 14){
            System.out.println("Указаное число лежит в промежутке [0 - 14].");
        }else if(i >= 15 && i <= 35) {
            System.out.println("Указаное число лежит в промежутке [15 - 35].");
        }else if (i >= 36 && i < 50){
            System.out.println("Указаное число лежит в промежутке [36 - 50).");
        }else if (i >= 50 && i <= 100) {
            System.out.println("Указаное число лежит в промежутке [50 - 100].");
        }else {
            System.out.println("Вы указали неверное число!");
        }
    }
}