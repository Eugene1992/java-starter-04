package classwork;

/**
 * Created by ПК on 12.05.2016.
 */
public class Print extends Printer {

    public static  void print (String value){
        System.out.println((char)+27+"[1m"+value);
    }

}

