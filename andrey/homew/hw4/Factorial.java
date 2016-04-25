package hw4;
/**
 -------------------------------------------- Факториал и делители числа ------------------------------------------------
 9. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.
 10. Выведите на экран все положительные делители натурального числа, введенного пользователем.
 11. Выведите на экран общие делители двух натуральных чисел, введенных пользователем.
 ------------------------------------------------------------------------------------------------------------------------
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите факториал натурально числа n : ");
            int n = scan.nextInt();
        int y=1;
        for (int i=1; i<=n; i++){
            y=y*i;
        }
        System.out.print(n+"!=");
        System.out.print(y);
    }
}
// 10. Выведите на экран все положительные делители натурального числа, введенного пользователем.
class  Natural{
    public static void main(String args[]){
        int n;
        int count = 0;
        System.out.print("Введіть натуральне число : ");
        Scanner sr = new Scanner(System.in);
        n = sr.nextInt();
        System.out.print("Число " + n + " ділиться на : " );
        for(int i = 1; i <= n; i++){
            if ((n % i) == 0){
                count++;
                System.out.print(i + " ");
            }
        }
        ///System.out.println("Количество делителей : " + count);
    }
}


