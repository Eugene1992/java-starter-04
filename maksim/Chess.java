package hm5;
import java.util.Scanner;
/**
 * Created by Max on 25.04.2016.
 */
public  class Chess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность доски: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                if((i+j)%2==0)
                    System.out.print("Ж");
                else
                    System.out.print("-");
            System.out.println();
        }

    }

}


