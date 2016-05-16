package hwBasic2Additional2;

import java.util.Scanner;

/**
 * Created by User on 16.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyArea myarea = new MyArea();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        double a = scan.nextDouble();
        myarea.radius = a;
        myarea.viewRaduis();
    }
}
