package hm5;

import java.util.Scanner;

/**
 * Created by Max on 25.04.2016.
 */
public class Calc {
    public static void main(String[] args) {
        int firstnumber, secondnumber, choice;

        System.out.println("1- Add");
        System.out.println("2- Sub");
        System.out.println("3- Div");
        System.out.println("4- Mul");
        System.out.print("Enter your choice -");
        Scanner sc = new Scanner(System.in);

        choice = sc.nextInt();
        System.out.print("Enter first number -");
        firstnumber = sc.nextInt();
        System.out.print("Enter second number -");
        secondnumber = sc.nextInt();
        calc(choice, firstnumber, secondnumber);
    }

    public static void calc(int choice, int x, int y) {
        int c;

        switch (choice) {
            case 1:
                c = x + y;
                System.out.print("Output-" + c);
                break;

            case 2:
                c = x - y;
                System.out.print("Output-" + c);
                break;

            case 3:
                c = x / y;
                System.out.print("Output-" + c);
                break;

            case 4:
                c = x * y;
                System.out.print("Output-" + c);
                break;
        }
    }
}