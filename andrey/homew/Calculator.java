import java.util.Scanner;
/*
  Используя IntelliJ IDEA, создайте класс Calculator.
 Напишите программу - консольный калькулятор.
 Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
 Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
 Выведите на экран результат выполнения арифметической операции.
 В случае использования операции деления, организуйте проверку попытки деления на ноль.
 И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
 пользователя.

  */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введіть перше число");
        Scanner scan= new Scanner(System.in);
        int b = scan.nextInt();
        System.out.println("Введыть друге число");
        Scanner scan1 =new Scanner(System.in);
        int b1 = scan1.nextInt();
        System.out.println("Виберіть аремхметичну операцію : 1)+ , 2)- , 3)*, 4)/  ");
        Scanner scan2 =new Scanner(System.in);
        int m = scan2.nextInt();
        switch(m){
            case 1:
                int i =b+b1;
                System.out.println("результат операції="+" "+i);
                break;
            case 2:
                int i1 =b-b1;
                System.out.println("результат операціїї ="+" "+i1);
                break;
            case 3:
                int i2=b*b1;
                System.out.println("результат операції="+" "+i2);
                break;
            case 4:
                if(b>0 & b1>0){
                    int i3=b/b1;
                    System.out.println("результат операції="+" "+i3);
                }
                else{
                    System.out.println("Помилка!!!!!!!Така операція не можлива.Спробуйте ще раз");
                }
                break;

        }

    }
}
