package hw4;
//Не дороблене!
/*
 В этом блоке задач используйте минимальный вывод в строку, то есть "Ж " или "- ", а не целыми строками
"Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -". Комбинируйте вложенными циклами и условиями if или switch.
*/
import java.util.Scanner;

public class Chess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность доски: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                if((i+j)%2==0)
                    System.out.print("----");
                else
                    System.out.print("ЖЖЖЖ ");
            System.out.println();
        }

    }

}


