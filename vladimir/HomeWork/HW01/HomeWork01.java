import java.util.Scanner;

/**
 * Created by User on 21.04.2016.
 */
    public class HomeWork01 {

            public static void main(String[] args) {

            // 1.
            byte b;
            short s;
            int i;
            long l;

            // 2.
            byte b1=2+3;
            System.out.println(b1);

            //3.
            short s1=5-3;
            System.out.println(s1);

            //4.
            int i1=6/2, i2=6/4;
            System.out.print(i1);
            System.out.print(i2);

            //5.
            long l1=5*8;
            System.out.println(l1);

            //6.
            byte b2=5, b3=35;
            byte b4=(byte)(b2+b3);
            System.out.println(b4);

            //7.
            short s2=79, s3=20;
            byte b5=3;
            byte b6=(byte)((s2+s3)/b5);
            System.out.println(b6);

            //8.
            short s4=45, s5=5;
            byte b7=30, b8=3;
            int i3=s4/s5*b7/b8;
            System.out.println(i3);

            //9.
            int i4=100, i5=50, i6;
            System.out.println("i4="+i4+" i5="+i5);
            i6=i4;
            i4=i5;
            i5=i6;
            System.out.println("i4="+i4+" i5="+i5);

            //10.
            int i7=100, i8=50;
            System.out.println("i7="+i7+" i8="+i8);
            i7=i7*i8;
            i8=i7/i8;
            i7=i7/i8;
            System.out.println("i7="+i7+" i8="+i8);

            //bonus
            byte b9=19;
            System.out.println(b9);
            int b10,b11,b12,b13,b14,b15,b16,b17;
            b10=b9%2;
            b9=(byte) (b9/2);
            b11=b9%2;
            b9=(byte) (b9/2);
            b12=b9%2;
            b9=(byte) (b9/2);
            b13=b9%2;
            b9=(byte) (b9/2);
            b14=b9%2;
            b9=(byte) (b9/2);
            b15=b9%2;
            b9=(byte) (b9/2);
            b16=b9%2;
            b9=(byte) (b9/2);
            b17=b9%2;

            System.out.print(b17);
            System.out.print(b16);
            System.out.print(b15);
            System.out.print(b14);
            System.out.print(b13);
            System.out.print(b12);
            System.out.print(b11);
            System.out.println(b10);

            //bonus2

                    System.out.println("Введите десятиричное число");
                    Scanner scan = new Scanner(System.in);
                    String res = "";
                    int i9 = scan.nextInt();
                    int  i11 = 0;
                    for (; i9 != 1; i9 = i9 / 2) {
                            i11 = i9 % 2;
                            res = i11+res;
                    }
                    res=1+res;
                    System.out.println(res);
            }

    }