/**
 * Created by Андрей on 21.04.2016.
 */
import java.util.Scanner;
public class fifthT {
    public static void main(String[] args) {
        double a , b,c ;
        Double D;
        System.out.println("Програма виводить рішення квадратного рівняння типу :");
        System.out.println("ax^2+bx+c=0");
        System.out.println("Введыть значення змынних");
        Scanner in= new Scanner(System.in);
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        D= b*b-4*a*c;
//Рішаємо квадратне рівняння
        if (D>0){
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a); x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корні рівняння: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;            x = -b / (2 * a);
            System.out.println("Рівняння має єдине рішення x = " + x);
        }
        else { System.out.println("Рівняння не має дійсний корнів");
        }









    }
}
