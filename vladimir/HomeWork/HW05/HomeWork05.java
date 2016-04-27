import java.util.Scanner;

public class HomeWork05 {
    public static void main(String[] args) {

        int lengthArray = inputN();
        int[] array = new int[lengthArray];
        for (int numberArray = 0; numberArray < lengthArray; numberArray++) {
            array[numberArray] = randomN();
            System.out.print(array[numberArray] + " ");
        }

        // 1. Вывести в консоль все парные числа одномерного массива
        System.out.println();
        System.out.println("Все парные числа масива");
        for (int numberArray = 0; numberArray < lengthArray; numberArray++) {
            if (array[numberArray] % 2 != 1) {
                System.out.print(array[numberArray] + " ");
            }
        }

        // 2. Вывести все числа одномерного массива в обратном порядке
        /*System.out.println();
        System.out.println("Массив в обратном порядке");
        for (int numberArray = 0; numberArray > lengthArray ; numberArray++) {
            System.out.print(array[numberArray]+" ");
        }*/

        // 3. Вывести первую и вторую половину одномерного массива
        System.out.println();
        System.out.println("Первая половина массива");
        for (int numberArray = 0; numberArray < lengthArray / 2; numberArray++) {
            System.out.print(array[numberArray] + " ");
        }
        System.out.println();
        System.out.println("Вторая половина массива");
        for (int numberArray = lengthArray / 2; numberArray < lengthArray ; numberArray++) {
            System.out.print(array[numberArray] + " ");
        }
    }

    static int inputN() {
        System.out.println("Введите разменость одноверного массва (от 0...до 2147483647)");
        Scanner scan = new Scanner(System.in);
        int lengthArray = scan.nextInt();
        return lengthArray;
    }

    static int randomN() {
        int randNum = (int) (Math.random() * 100);
        return randNum;
    }

}

