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
        double a = scan.nextDouble();
        System.out.print("Введите длину второй стороны : ");
        double b = scan.nextDouble();
        rectangle.side1 = a;
        rectangle.side2 = b;

        rectangle.viewRectangle();
    }
}
