import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class Task03 {
    public static void main(String[] args) {


        int a=10;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number 1 (from 0...to 2147483647)");
        int i = scan.nextInt();
        System.out.println("Enter the Number 2 (from 0...to 2147483647)");
        int j = scan.nextInt();
        if(abs(i-a)< abs(j-a)){
            System.out.println("Первое число ближе к 10");
        }
        else{
            System.out.println("Второе число ближе к 10");
        }

    }
}