import java.util.Scanner;

public class HomeWork05 {
    public static void main(String[] args) {

        int lengthArray = inputN();
        int[] array = new int[lengthArray];
        for (int numberArray = 0; numberArray < lengthArray; numberArray++) {
            array[numberArray] = randomN();
            System.out.print(array[numberArray] + " ");
        }
        System.out.println();

        // 1. Вывести в консоль все парные числа одномерного массива
        System.out.println();
        System.out.println("Все парные числа масива");
        for (int numberArray = 0; numberArray < lengthArray; numberArray++) {
            if (Math.abs(array[numberArray] % 2) != 1) {
               System.out.print(array[numberArray] + " ");
            }
        }

        // 2. Вывести все числа одномерного массива в обратном порядке
        System.out.println();
        System.out.println("Массив в обратном порядке");
        for (int numberArray = lengthArray - 1; numberArray >= 0 ; numberArray--) {
            System.out.print(array[numberArray]+" ");
        }

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

        // 4. Вывести первую и вторую половину одномерного массива в обратном порядке
        System.out.println();
        System.out.println("Первая половина массива в обратном порядке");
        for (int numberArray = lengthArray / 2 - 1; numberArray >= 0; numberArray--) {
            System.out.print(array[numberArray] + " ");
        }
        System.out.println();
        System.out.println("Вторая половина массива в обратном порядке");
        for (int numberArray = lengthArray - 1; numberArray >= lengthArray / 2; numberArray--) {
            System.out.print(array[numberArray] + " ");
        }

        // 5. Найти сумму все элементов в массиве
        System.out.println();
        System.out.println("Сумма всех элементов массива");
        int sumArray = 0;
        for (int numberArray = 0; numberArray < lengthArray; numberArray++) {
            sumArray = sumArray + array[numberArray];
        }
            System.out.print(sumArray);

        // 6. Найти среднеарифметическое всех чисел массива
        System.out.println();
        System.out.println("Cреднеарифметическое всех элементов массива");
            double sumArrayLong = array[0];
        for (int numberArray = 1; numberArray < lengthArray; numberArray++) {
            sumArrayLong = sumArrayLong + array[numberArray];
        }
            sumArrayLong = sumArrayLong / (lengthArray);
        System.out.print(sumArrayLong);

        // 7. Найти минимальное и максимальное число в массиве
        System.out.println();
        System.out.println("Максимальное и минимальное число в массиве");
        int maxArray = array[0];
        int minArray = array[0];
        for (int numberArray = 0; numberArray < lengthArray; numberArray++) {
            if (maxArray < array[numberArray]) {
                maxArray = array[numberArray];
            }
            if (minArray > array[numberArray]) {
                minArray = array[numberArray];
            }
        }
                System.out.print("Max=" + maxArray + " Min=" + minArray);

        // 8. Заменить все отрицательные числа в массиве на 0
        System.out.println();
        System.out.println("Отрицательные числа заменены на 0");
        int [] array0 = new int[lengthArray];
        for (int numberArray = 0; numberArray < lengthArray; numberArray++) {
            if (array[numberArray] > 0) {
                array0[numberArray] = 0;
            } array0[numberArray] = array[numberArray];
            System.out.print(array0[numberArray]+ " ");
        }

        // 9. Подсчитать одинаковые числа в одномерном массиве
        System.out.println();
        System.out.println("Одинаковые числа");

        for (int element = 0; element < lengthArray; element++) {
            int number = 0;
            for (int numberArray = 0; numberArray < lengthArray; numberArray++) {
                if (array[element] == array[numberArray]) {
                    number = number + 1;
                }
            }
            if (number > 1) {
                oldNumber:
                for (int oldEllement = 1; oldEllement < element; oldEllement++) {
                    if (array[element] == array[element - oldEllement]){
                        break ;
                    }
                }
                System.out.println(array[element] + " - " + number + "шт.");
            }
        }
    }

    static int inputN() {
        System.out.println("Введите разменость одноверного массва (от 0...до 2147483647)");
        Scanner scan = new Scanner(System.in);
        int lengthArray = scan.nextInt();
        return lengthArray;
    }

    static int randomN() {
        int randNum = (int) (Math.random() * (100 + 100) - 100);
        return randNum;
    }

}

