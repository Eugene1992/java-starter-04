package classw;
import java.util.Scanner;

public class Recursia {
    public static void main(String[] args) {
        gameRul();
    }

 static  void gameRul(){
     Scanner scan=new Scanner(System.in);
     System.out.println("введи свій варыант :");
     int b=scan.nextInt();
     int number = (int) (Math.random() * 10);
     if (b == number){
         System.out.println("ви угадали");
     }
     else{
         System.out.println("ви не вгадали! спробуйте ще раз");
         gameRul();
     }
 }

}




