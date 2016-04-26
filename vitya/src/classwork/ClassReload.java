package classwork;

import java.util.Scanner;

/**
 * Created by ПК on 26.04.2016.
 */
public class ClassReload {
    public static void main(String[] args) {
        //System.out.println(fib (5));

        //}
        // static int fib(int num){
        // if (num==1)return 1;
        // if (num==2)return 1;
        // return fib(num -1)+fib(num -2);
        // }
        randomNumber();
        int [] array=new int[]{3,4,5};

        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]+ " ");
        }

    }

    static int randomNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = scan.nextInt();
        int b = 6;
        for (int i = 0; i < a; i++) {

        }
        if (a == b) {
            System.out.println("Yes!All right!");
            return a;

        }
        if (b < a) {
            System.out.println("Wrong number");
            return randomNumber();
        }
        if (a > b) {
            System.out.println("Wrong number");
            return randomNumber();
        }
        return randomNumber();


    }


}








