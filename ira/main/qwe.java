/**
 * Created by Student on 4/21/2016.
 */
public class qwe {
    public static void main(String[] args) {

        for(int randNum = 0;randNum < 100; randNum++){

            randNum = (int) (Math.random() * 100);
            if (randNum % 2 == 0) {
                randNum += 1;
                System.out.println("Orel" + randNum + " %.");
            } else {
                randNum += 1;
                System.out.println("Reshka" + randNum + " %.");

            }
        }

    }
}
