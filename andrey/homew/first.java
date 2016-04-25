import java.util.Scanner;

public class first {
    public static void main(String[] arqs)
    {
        System.out.println("введіть число");
        Scanner scan= new Scanner(System.in);
        int b= scan.nextInt();
        if (((b%2)==0)||((b%1)==0)){
            System.out.println("Число"+" "+b+" "+"Кратне");
        }
        else {
            System.out.println("Число"+" "+b+" "+ "Не кратне");
        }
    }

}
