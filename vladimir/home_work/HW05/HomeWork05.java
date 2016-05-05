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
        for (int numberArray = 0; numberArray < array.length; numberArray++) {
            if (Math.abs(array[numberArray] % 2) != 1) {
               System.out.print(array[numberArray] + " ");
            }
        }

        // 2. Вывести все числа одномерного массива в обратном порядке
        System.out.println();
        System.out.println("Массив в обратном порядке");
        for (int numberArray = array.length - 1; numberArray >= 0 ; numberArray--) {
            System.out.print(array[numberArray]+" ");
        }

        // 3. Вывести первую и вторую половину одномерного массива
        System.out.println();
        System.out.println("Первая половина массива");
        for (int numberArray = 0; numberArray < array.length / 2; numberArray++) {
            System.out.print(array[numberArray] + " ");
        }
        System.out.println();
        System.out.println("Вторая половина массива");
        for (int numberArray = lengthArray / 2; numberArray < array.length ; numberArray++) {
            System.out.print(array[numberArray] + " ");
        }

        // 4. Вывести первую и вторую половину одномерного массива в обратном порядке
        System.out.println();
        System.out.println("Первая половина массива в обратном порядке");
        for (int numberArray = array.length / 2 - 1; numberArray >= 0; numberArray--) {
            System.out.print(array[numberArray] + " ");
        }
        System.out.println();
        System.out.println("Вторая половина массива в обратном порядке");
        for (int numberArray = array.length - 1; numberArray >= array.length / 2; numberArray--) {
            System.out.print(array[numberArray] + " ");
        }

        // 5. Найти сумму все элементов в массиве
        System.out.println();
        System.out.println("Сумма всех элементов массива");
        int sumArray = 0;
        for (int numberArray = 0; numberArray < array.length; numberArray++) {
            sumArray = sumArray + array[numberArray];
        }
            System.out.print(sumArray);

        // 6. Найти среднеарифметическое всех чисел массива
        System.out.println();
        System.out.println("Cреднеарифметическое всех элементов массива");
        double sumArrayLong = array[0];
        for (int numberArray = 1; numberArray < array.length; numberArray++) {
            sumArrayLong = sumArrayLong + array[numberArray];
        }
        sumArrayLong = sumArrayLong / (array.length);
        System.out.print(sumArrayLong);

        System.out.println();
        System.out.println("Cреднеарифметическое всех элементов массива 2 способ");
        double sumArrayLong2 = 0;
        for (int numberArray = 0; numberArray < array.length; numberArray++) {
            sumArrayLong2 = sumArrayLong2 + array[numberArray];
        }
        sumArrayLong2 = sumArrayLong2 / (array.length);
        System.out.print(sumArrayLong2);

        // 7. Найти минимальное и максимальное число в массиве
        System.out.println();
        System.out.println("Максимальное и минимальное число в массиве");
        int maxArray = array[0];
        int minArray = array[0];
        for (int numberArray = 0; numberArray < array.length; numberArray++) {
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
        int [] array0 = new int[array.length];
        for (int numberArray = 0; numberArray < array.length; numberArray++) {
            if (array[numberArray] < 0) {
                array0[numberArray] = 0;
                continue;
            } array0[numberArray] = array[numberArray];
        }
        for (int numberArray = 0; numberArray < array.length; numberArray++) {
            System.out.print(array0[numberArray] + " ");
        }
        // 9. Подсчитать одинаковые числа в одномерном массиве
        System.out.println();
        System.out.println("Одинаковые числа");


        for (int element = 0; element < array.length; element++) {
            int number = 0;
            for (int numberArray = 1; numberArray < array.length ; numberArray++) {
                if (array[element] == array[numberArray]) {
                    number = number + 1;
                }
            }
            oldNumber:
            if (number > 1) {

                for (int oldEllement = 1; oldEllement < element; oldEllement++) {
                    if (array[element] == array[element - oldEllement] ) {
                        //System.out.println(array[element] + " - " + number + "повтор");
                        number = 0;
                        break oldNumber;
                    }
                }
                System.out.println(array[element] + " - " + number + "шт.");
            }

        }

        // 10. Поменять минимальное и максимальное числа в массиве местами
        System.out.println("Максимальное минимальное число поменяны местами");
        int maxArray10 = array[0];
        int minArray10 = array[0];
        for (int numberArray = 0; numberArray < array.length; numberArray++) {
            if (maxArray10 < array[numberArray]) {
                maxArray10 = array[numberArray];
            }
            if (minArray10 > array[numberArray]) {
                minArray10 = array[numberArray];
            }
        }
        System.out.println("Max=" + maxArray10 + " Min=" + minArray10);
        int array10 [] = new int[lengthArray];
        for (int numberArray = 0; numberArray < array.length; numberArray++){
            if (array[numberArray] == maxArray10) {
                array10[numberArray] = minArray10;
                continue;
            }
            if (array[numberArray] == minArray10) {
                array10[numberArray] = maxArray10;
                continue;
            }
            array10[numberArray] = array[numberArray];

        }
        for (int numberArray = 0; numberArray < array.length; numberArray++) {
            System.out.print(array10[numberArray] + " ");
        }

        // 11. Инвертировать массив
        System.out.println();
        System.out.println("Инвертированый массив");
        int invArray[] = new int[array.length];
        for (int numberArray = 0; numberArray < array.length; numberArray++){
            invArray[numberArray] = array[array.length - 1 - numberArray];
            System.out.print(invArray[numberArray] + " ");
        }

        // 12. Вывести в консоль половину массива, среднеарифметическое которых является наибольшим
        System.out.println();
        System.out.println("Часть масива у которой среднеарифметическое больше");
        double maxArray1 = 0;
        double maxArray2 = 0;
        for (int numberArray = 0; numberArray < array.length / 2; numberArray++){
            maxArray1 = maxArray1 + array[numberArray];
            maxArray2 = maxArray2 + array[array.length / 2 + numberArray];
        }
        maxArray1 = maxArray1 / (array.length / 2);
        maxArray2 = maxArray2 / (array.length / 2);
        if (maxArray1 == maxArray2) {
            System.out.println("Среднеарифметические обеих частей массива равны");
             }else if (maxArray1 > maxArray2){
                      System.out.println("Среднеарифметическое и первая чать массива");
                         System.out.println(maxArray1 + " > " + maxArray2);
                         for (int numberArray = 0;numberArray < array.length / 2; numberArray++){
                            System.out.print(array[numberArray] + " ");
                         }
             }else  if (maxArray1 < maxArray2){
                     System.out.println("Среднеарифметическое и вторая чать массива");
                        System.out.println(maxArray1 + " < " + maxArray2);
                         for (int numberArray = array.length / 2; numberArray < array.length ; numberArray++) {
                             System.out.print(array[numberArray] + " ");
                         }
             }

        // 13. Найти индексы положительных чисел и сумму отрицательных чисел в одномерном массиве
        System.out.println();
        System.out.println("Номера положительных чисел в массиве");
        for (int numberArray = 0; numberArray < array.length; numberArray++){
            if (array[numberArray] > 0){
                System.out.print((numberArray + 1) + " ");
            }
        }
        System.out.println();
        System.out.println("Нули находятся в");
        for (int numberArray = 0; numberArray < array.length; numberArray++){
            if (array[numberArray] == 0){
                System.out.print((numberArray + 1) + " ");
            }
        }
        System.out.println();
        System.out.println("Номера отрицательных чисел в массиве");
        for (int numberArray = 0; numberArray < array.length; numberArray++){
            if (array[numberArray] < 0){
                System.out.print((numberArray + 1) + " ");
            }
        }
        System.out.println();
        int minSum = 0;
        for (int numberArray = 0; numberArray < array.length; numberArray++){
            if (array[numberArray] < 0){
            minSum = minSum + array[numberArray];
            }
        }
        System.out.println("Сумма отрицательных чисел = " + minSum);

        // 14. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
        System.out.println("Числа массива до нуля");
        int numberArray = 0;
        do {
            System.out.print(array[numberArray] + " ");
            if (array[numberArray] == 0 ) break;
            numberArray++;
        } while (numberArray < array.length);


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

