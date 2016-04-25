// Методы

import java.util.Scanner;

public class ClassWork3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a and b");
        int a = scan.nextInt();
        int b = scan.nextInt();

        calcNumber(a, b);

    }

    static int calcNumber(int a, int b) {
        int a1 = 1, b1 = 1;
        int max = 1;
        if (a > b) {
            for (int i = 1; i == b; i++) {
                if (a % i == 0 && b % i == 0) {

                    printMy(i);
                }

            }



        } return max;
    }

    static void printMy(int i) {
        System.out.println("-2-");
        System.out.println(i);
    }

}


