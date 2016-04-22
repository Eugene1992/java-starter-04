import java.util.Scanner;

/**
 * Created by User on 21.04.2016.
 */
public class hw3 {
    public static void main(String[] args) {
        //2
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (i % 2 == 0) {
            System.out.println("Вы ввели чётное число");
        } else {
            System.out.println("Вы ввели нечётное число");
        }

        //3
        Scanner scan1 = new Scanner(System.in);
        int i1 = scan1.nextInt();
        int i2 = scan1.nextInt();
        int i3 = 10;
        if (i1 > i2 && i1 <= i3) {
            System.out.println("Число " + i1 + " ближе к 10");
        }
        if (i1 > i2 && i1 > i3) {
            System.out.println("Число " + i2 + " ближе к 10");
        }
        if (i1 < i2 && i1 < i3) {
            System.out.println("Число " + i2 + " ближе к 10");
        }
        if (i1 < i2 && i1 >= i3) {
            System.out.println("Число " + i1 + " ближе к 10");
        }
        if (i1 == i2) {
            System.out.println("Оба числа ближе к 10");
        }
        //4
        int a = 7;
        int a1 = 77;
        int a2 = 52;
        if (a > a1 && a > a2) {
            if (a1 <= a && a2 <= a)
                System.out.println(a);
        }
        if (a1 > a && a1 > a2) {
            if (a <= a1 && a2 <= a1)
                System.out.println(a1);
        }
        if (a2 > a && a2 > a1) {
            if (a <= a2 && a1 <= a2)
                System.out.println(a2);
        }
        //5
        int b = 7;
        int b1 = 20;
        int b2 = 8;
        int b3 = 1;






















        }
    }
}


        //6
        //float c1=20;
       // float c2=40;
      //  float c3=60;















