import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        System.out.println("Enter the Number");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int a=1;

        for(; i!=1 ; i--){
            a*=i;
        }

        System.out.println(a);
    }

}
