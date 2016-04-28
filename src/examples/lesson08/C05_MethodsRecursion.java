package lesson08;

/**
 * Created by WebCamp on 11.07.2015.
 */
public class C05_MethodsRecursion {
    // Рекурсия (простая рекурсия).

    // В теле метода recursion на 19-й строке рекурсивно вызывается метод recursion.
    // Простая рекурсия -  вызов методом самого себя (самовызов). При каждом вызове строится новая копия метода.

    static void recursion(int counter) {
        counter--;

        System.out.println("Первая половина метода: " + counter);

        if (counter != 0)
            recursion(counter);

        System.out.println("Вторая половина метода: " + counter);
    }

    public static void main(String[] args) {

        recursion(3);

    }

}
