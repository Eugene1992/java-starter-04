package hm5;
import java.util.Scanner;
/**
 * Created by Max on 23.04.2016.
 */

public class Factorial {
    public static void main(String[] args) {
        int y=1;
        int n=8;
        for (int i=1; i<=n; i++){
            y=y*i;
        }
        System.out.print(n+"!=");
        System.out.print(y);


    }

}
