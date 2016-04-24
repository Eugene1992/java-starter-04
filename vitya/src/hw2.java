/**
 * Created by User on 20.04.2016.
 */
public class hw2 {
    public static void main(String[] args) {

    //1
        byte a1=20;
        short a2= 40;
        int a3 =60;
        long a4=80;
     //2
        byte b1 = 100+26;
        System.out.println(b1);
     //3
        short c1=1500-200;
        System.out.println(c1);
     //4
        int d1=160/2;
        System.out.println(d1);
     //5
        long e1=300*2;
        System.out.println(e1);
     //6
        byte f1 = 20;
        byte f2= 20;
        byte f3= (byte)(f1+f2);
        System.out.println(f3);
     //7
        short z1=20;
        short z2=70;
        short z3= (short)(z1+z2);
        byte z4 = 2;
        byte z5= (byte) (z3/z4);
        System.out.println(z5);
     //8
        short j1=60;
        short j2=6;
        short j3=(short)(j1/j2);
        byte j4= 100;
        byte j5=20;
        byte j6=(byte)(j4/j5);
        int j7 =j3*j6;
        System.out.println(j7);
     //9
        int ab=10;
        int ac=20;
        int ad=(ab=12)-(ac=25) ;
        System.out.println(ab);
        System.out.println(ac);
     //10
        int ba = 5;
        int ca=(ba=15)*(ca=ba);
        System.out.println(ba);
        System.out.println(ca);

     //Bonus
        //Дано число от 0 до 255 в десятичной системе исчисления. Написать программу, которая переводит данное число в двоичную
        //систему исчисления и выводит в консоль. Запрещается использовать циклы (for, while и т.д.) или условия(if)

        byte l=56;
        int l1=l%2;
        int l2=l/2;
        int l3=l2%2;
        int l4=l2/2;
        int l5=l3%2;
        int l6=l4/2;
        int l7=l6%2;
        int l8=l6/2;
        int l9=l7&2;
        int l10=l8/2;
        int l11=l10%2;
        int l12=l10/2;
        int l13=l12&2;
        System.out.print(l12);
        System.out.print(l11);
        System.out.print(l9);
        System.out.print(l7);
        System.out.print(l5);
        System.out.print(l3);
        System.out.print(l1);

















    }
    }

