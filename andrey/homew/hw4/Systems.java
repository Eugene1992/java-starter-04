package hw4;
/*
6. Написать программу, которая реализует следующий функционал:
  6.1 Пользователь вводит число в 10-ой системе счисления.
  6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
      1) в 2-ую
      2) в 8-ую
      3) в 16-ую
  6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
  на экран результат.

 */
import java.util.Scanner;
public class Systems {
    public static void main(String[] args) {
        System.out.println("Введіть число в десятковій системі :");
        Scanner scan= new Scanner(System.in);
        int b =scan.nextInt();
        System.out.println("В иберіть систему числення 1)в 2-у  2)в 8-у 3) в 16-у ");
        Scanner scan1= new Scanner(System.in);
        int numb =scan1.nextInt();
        String result="";
        switch (numb) {
            case 1:
                while(b!=1){
                    result=(b%2)+result;
                    b=b/2;
                    if(b==1){
                        result=1+result;
                    }
                }
                System.out.println(result);
                break;
            case 2:

                while(b!=1){
                    result=(b%8)+result;
                    b=b/8;
                    if(b==1){
                        result=1+result;
                    }
                }
                System.out.println(result);
                break;
        }



    }
}
