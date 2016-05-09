package hw5;

/**
 * Created by User on 09.05.2016.
 */
public class Hw5T3 {
    public static void main(String[] args) {
        // Вывести первую и вторую половину одномерного массива
        int a[] = new int[]{10, 20, 40, 3};
        for (int i = 0; i < a.length / 2; i++) {
            System.out.println("Первая часть массива " + a[i]);
        }
        for (int j = a.length / 2; j < a.length; j++) {
            System.out.println("Вторая часть массива " + a[j]);
        }
    }
}
