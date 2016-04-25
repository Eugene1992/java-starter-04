import java.util.Scanner;

public class secondT {
    public static void main(String[] args) {
        int a=10;
//ввщдимо перше число
        Scanner scan= new Scanner(System.in);
        double  b= scan.nextDouble();
//друге число
        double d = scan.nextDouble();
        System.out.println(" перше число"+" "+b);
        System.out.println(" перше число"+" "+ d);
        if(((a== b)||(a>b))||((a==d)||(a>b))){
            System.out.println("Число"+" "+b+" "+"Найближче до а ");
        }
        else{
            System.out.println("Число"+" "+d+" "+"Найближче до а ");
        }
    }
}
