//Перегрузка методов
    import java.util.Scanner;


public class ClassWork4 {
    public static void main(String[] args) {
        ifNumber();
        System.out.println("Число угадано");
    }

    static int inNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число 0...10");
        int a = scan.nextInt();
        return a;
    }

    static int randomN() {
        int randNum = (int) (Math.random() * 10);
        return randNum;
    }

    static int ifNumber() {
        int ran1 = randomN();
        int in1 = inNumber();

        if (ran1 != in1) {
            System.out.println("Не угадал попробуй еще раз");


            ifNumber();
        }
        return 5;
    }
}

