package classw;
//Перезаписуємо массив в обратному порядку
/**
 * Created by Андрей on 28.04.2016.
 */
public class Forich {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(revers(s));
    }
    static String revers(String s) {
        char[] s1 = s.toCharArray();
        String s2 = "";
        for (int i = s1.length - 1; i >= 0; i--) {
            s2 +=s1[i];
        }
        return s2;
    }
}