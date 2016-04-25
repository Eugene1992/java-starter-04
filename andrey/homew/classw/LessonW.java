package classw;
//Переводить число в 2 систему
import java.util.Scanner;

public class LessonW {
    public static void main(String[] args) {
        String result="";
        System.out.print("Введіть число:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        while(a!=1){
            result=(a%2)+result;
            a=a/2;
            if(a==1){
                result=1+result;
            }
        }
        System.out.println(result);
    }
}
