package ref;

/**
 * Created by Евгений on 16.05.2016.
 */
public class RefValueQuiz1 {
    public static void main(String[] args) {
        int x = 0;
        int[] arr = {20};
        x = f(x, g(x, arr));
        System.out.println(x + " " + arr[0]);
    }

    public static int f(int x, int arr[]){
        x += 30;
        arr[0] = 40;
        return 42;
    }

    public static int[] g(int x, int arr[]){
        x = 50;
        arr = new int[]{60};
        return arr;
    }
}
