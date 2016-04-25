import java.util.Scanner;

/**
 * Created by notebook on 22.04.2016.
 */
public class Hw04 {
    /*
    1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
     */
    public static void main(String[] args) {
        int i;
        for (i = 1000; i < 10000; i += 3) {
            System.out.println(i);

        }
    }
}


class Hw04_2 {
    /*
    2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
     */
    public static void main(String[] args) {
        int a;
        for (a = 1; a <= 109; a += 2) {
            System.out.println(a);

        }
    }
}


class Hw04_3 {
    /*
    3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
     */
    public static void main(String[] args) {
        int b;
        for (b = 90; b >= 0; b -= 5) {
            System.out.println(b);

        }
    }
}


class Hw04_4 {
    /*
    4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
     */
    public static void main(String[] args) {
        int a;
        for (a = 2; a <= 1048576; a *= 2) {
            System.out.println(a);

        }
    }
}

class Hw04_5 {
    /*
    5. Выведите на экран первые 20 членов последовательности Фибоначчи.
     */
    public static void main(String[] args) {
        int a = 0;
        int c = 1;
     for(c = 1; c <= 4181; c = c + a){
         a += c;
         System.out.println(c);
         System.out.println(a);
     }
    }
}

class Hw04_6{
    /*6. Написать программу, которая реализует следующий функционал:
  6.1 Пользователь вводит число в 10-ой системе счисления.
  6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
      1) в 2-ую
      2) в 8-ую
      3) в 16-ую
  6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
  на экран результат.*/
    public static void main(String[] args) {
        int i = 53;
        String s = "";
        while (i !=0 ){
            s = (i = i%2)+ s;
            i = i/2;
            if (i == 1){
                s = 1 + s;
            }
        }
        System.out.print(s);
    }
}

class Hw04_7 {
    //Орел и решка
    public static void main(String[] args) {
        int b = 0;
        int a = 0;
        int c = 0;
        int randNum;
        while (b < 100) {
            randNum = (int) (Math.random() * 100);
            b++;
            if (randNum % 2 == 0) {
                a++;
            } else {
                c++;
            }
        }
        System.out.println("Orel = "+a+"%, reshka = "+c+"%.");
    }
}

class Hw04_8 {
    //4!=4*3*2*1
    public static void main(String[] args) {
        String s = "4!=";
        int a;
        int b = 1;
        for(a = 4;a>0;a-- ){
            b = b * a;
        }
        System.out.println(s+b);
    }

}

class Hw04_09 {
    /*
     Выведите в консоль "шахматную доску" размером 32х32 знаков(пробелы не учитывать).
     */
    public static void main(String[] args) {
        String a = "Ж ";
        String b = "- ";
        int c = 0;//4 Ж
        int d = 0;//4
        int r = 0;//32 Ж
        int f = 0;//32
        int e = 0;//1024
        while (e < 1024) {
            e++;
            c++;
            d++;
            r++;
            f++;
            if (d == 4 && f == 32){
                c = 0;
                r = 0;
                d = 0;
                r = 0;
            }else if (c < 4 && r < 32)  {
                a = "Ж " + a;
                System.out.print(a);
            } else if (c < 4 && r < 32) {
                a = "Ж " + a;
                System.out.println(a);
            } else if (d < 4 && f < 32) {
                b = "- " + b;
                System.out.print(b);
            } else if (d < 4 && f < 32) {
                b = "- " + b;
                System.out.println(b);

            }

        }
    }
}

class Hw04_10{
    /**
     * 10. Выведите на экран все положительные делители натурального числа, введенного пользователем.
     */
    public static void main(String[] args) {

    }
}
