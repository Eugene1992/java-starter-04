package hw5;

/**
 * Created by User on 09.05.2016.
 */
public class Hw5T4 {
    public static void main(String[] args) {
        //Вывести первую и вторую половину одномерного массива в обратном порядке
        int a[] = new int[]{20, 30, 10, 55};
        for (int i = (a.length - 1) / 2; i >= 0; i--) {
            System.out.println("Первая часть массива в обратном порядке :" + a[i]);
        }
        for (int j = a.length - 1; j >= a.length / 2; j--) {
            System.out.println("Вторая часть массива в обратном порядке :" + a[j]);
        }
    }
}
