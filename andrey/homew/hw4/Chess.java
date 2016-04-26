package hw4;
/*
 В этом блоке задач используйте минимальный вывод в строку, то есть "Ж " или "- ", а не целыми строками
"Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -". Комбинируйте вложенными циклами и условиями if или switch.
*/
import java.util.Scanner;
public class Chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите размерность доски: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int a = 0; a <= n ; a++){
            for(int b = 0; b <=m ; b++) {
                if (a % 8 <= 3) {
                    if (b % 8 <= 3) {
                        System.out.print(" Ж ");
                    } else {
                        System.out.print(" - ");
                    }
                } else {
                    if (b % 8 <= 3) {
                        System.out.print(" - ");
                    } else {
                        System.out.print(" Ж ");
                    }
                }
            }
            System.out.println();
        }
    }
}


