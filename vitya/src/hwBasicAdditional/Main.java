package hwBasicAdditional;

/**
 * Created by User on 11.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Adress adress = new Adress();
        adress.country = "Ukraine";
        adress.city = "Kiev";
        adress.index = 2232;
        adress.street = "Point street";
        adress.house = 23;
        adress.apartament = 14;

        adress.viewAdress();
    }
}
