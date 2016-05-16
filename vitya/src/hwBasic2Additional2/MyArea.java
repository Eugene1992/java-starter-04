package hwBasic2Additional2;

/**
 * Created by User on 13.05.2016.
 */
public class MyArea {
    //Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle,
    //который должен принимать радиус и используя PI посчитать площадь круга.
    //Создать класс Main, где запустить данный метод.

    public static final double PI = 3.14;
    public static double radius;

    public MyArea() {
    }

    public static double areaOfCircle() {
        double area = PI * (radius * radius);
        return area;
    }

    public void viewRaduis() {
        System.out.println(areaOfCircle());
    }
}
