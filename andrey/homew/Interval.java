/*
Используя IntelliJ IDEA, создайте класс Interval.
Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
выводится соответствующее сообщение.
 */
        import java.util.Scanner;
        public class Interval {
            public static void main(String[] args) {
                System.out.println("Введіть зачення n: ");
            Scanner in=new Scanner(System.in);
            int n = in.nextInt();
                       if(n>0 & n<=14) {
                           System.out.println("Введене число знаходиться в діапазоні від 0 до 14");
                           }
                           if((n>15)&(n<=35)){
                               System.out.println("Введене число знаходиться в діапазоні від 15 до 35");
                           }
                            if((n>36)&(n<=50)){
                            System.out.println("Введене число знаходиться в діапазоні від 36 до 50");
                            }
                            if((n>50)&(n<=100)){
                            System.out.println("Введене число знаходиться в діапазоні від 50 до 100");
                            }
                            else if((n<0&(n>100))){
                                System.out.println("Введене число не належить жодному діапазону!Спробуйте ще раз ");
                            }
            }
        }