package hwBasicHw2;

import java.util.Scanner;

/**
 * Created by User on 12.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.print("Введите длину первой стороны : ");
        int a = scan.nextInt();
        System.out.print("Введите длину второй стороны : ");
        int b = scan.nextInt();
        rectangle.side1 = a;
        rectangle.side2 = b;

        rectangle.viewRectangle();
    }
}
