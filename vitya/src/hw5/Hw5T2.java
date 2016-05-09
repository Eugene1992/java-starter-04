package hw5;

/**
 * Created by User on 09.05.2016.
 */
public class Hw5T2 {
    public static void main(String[] args) {
        //Вывести все числа одномерного массива в обратном порядке
        int a[] = new int[]{10, 3, 80, 7};
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
