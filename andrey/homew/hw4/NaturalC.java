package hw4;

import java.util.Scanner;

/**
 11. Выведите на экран общие делители двух натуральных чисел, введенных пользователем.

 */
public class NaturalC {
    public static void main(String args[]){
        int n,a;
        int count = 0;
        int count1=0;
        System.out.println("Введіть перше  натуральне число : ");
        Scanner sr = new Scanner(System.in);
        n = sr.nextInt();
        System.out.println("Введіть друге  натуральне число : ");
        a= sr.nextInt();
        System.out.println("Число " + n + " ділиться на : ");
        System.out.print("Число " + a + " ділиться на : ");
        for(int i = 1; i <= n; i++){
            if ((n % i) == 0){
                count++;
                System.out.print(i + " ");
                System.out.println();
            }
            for(int d=1; d<=a;d++){
                if((a%d)==0){
                    count1++;
                    System.out.print(d + " ");
                }
            }
        }
        System.out.println("Кількість дільників першого числа : " + count);
        System.out.print("Кількість дільників  другого числа: " + count1);
    }
}

