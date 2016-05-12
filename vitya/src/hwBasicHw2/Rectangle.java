package hwBasicHw2;

import java.io.InputStream;

/**
 * Created by User on 12.05.2016.
 */
//В теле класса создать два поля, описывающие длины сторон double side1, double side2.
//Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2)
// и периметр прямоугольника – double perimeterCalculator (double side1, double side2).
//Написать программу, которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр
//и площадь.

public class Rectangle {
    public double side1;
    public double side2;

    public Rectangle() {
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    private double areaCalculator() {
        return side1 * side2;

    }

    private double perimeterCalculator() {
        return side1 + side2;

    }

    public void viewRectangle() {
        System.out.println("Площадь прямоугольника = " + areaCalculator());
        System.out.println("Периметер прямоугольника = " + perimeterCalculator());
    }


}
