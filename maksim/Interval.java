package hm5;

/**
 * Created by Max on 22.04.2016.
 */
import java.util.Scanner;
public class Interval {

    public static void main(String[] args) {

        System.out.print("Введите число от 1 до 100 : ");
            Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        if (a>0 & a<=14){
            System.out.println("Диапазон числа от 0 до 14");
        }
        if (a>15 & a<=35){
            System.out.println("Диапазон числа от 15 до 35");
        }
        if(a>36 & a<=50){
            System.out.println("Диапазон числа от 36 до 50");
        }
        if (a>50 & a<=100){
            System.out.println("Диапазон числа от 50 до 100");
        }
        }
    }

