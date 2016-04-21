import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {


        System.out.println("Enter the Number (from 0...to 2147483647)");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        if ((i%2)==1){
            System.out.println("Not Even");
        }
        else
            System.out.println("Even");
    }

}