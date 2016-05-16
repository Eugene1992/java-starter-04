package ref;

/**
 * Created by Евгений on 16.05.2016.
 */
public class RefValueQuiz {
    public static void main(String[] args) {
        int x = 0;
        int[] arr = {20};
        f(x, arr);
        System.out.println(x + " " + arr[0]);
        g(x, arr);
        System.out.println(x + " " + arr[0]);
    }

    public static void f(int x, int arr[]){
        x += 30;
        arr[0] = 40;
    }

    public static void g(int x, int arr[]){
        x = 50;
        arr = new int[]{60};
    }
}
