import java.util.Scanner;

public class ClassWork06 {
    public static void main(String[] args) {

        int lengthArray = 64;
        char[] array = new char[lengthArray];
        for (int numberArray = 0; numberArray < 26; numberArray++) {
            array[numberArray] = invertChar(97 + numberArray);
           // System.out.print(array[numberArray] + " ");
        }
        for (int numberArray = 27; numberArray < 53; numberArray++) {
            array[numberArray] = invertChar(38 + numberArray);
            //System.out.print(array[numberArray] + " ");
        }
        for (int numberArray = 54; numberArray < lengthArray; numberArray++) {
            array[numberArray] = invertChar(-6 + numberArray);
          //  System.out.print(array[numberArray] + " ");
        }
        String str = "";
        int str2 = inputN();
        for (int str1 = 0; str1 < str2; str1++){
        str = str + array [randomN(lengthArray)];
        }
        System.out.println();
        System.out.println(str);
    }

    static int inputN() {
        System.out.println();
        System.out.println("Введите колличество символов (от 0...до 2147483647)");
        Scanner scan = new Scanner(System.in);
        int lengthString = scan.nextInt();
        return lengthString;
    }

    static char invertChar (int i){

        char ch = (char) i;
        return ch;
    }

    static int randomN(int i) {

        int randNum = (int) (Math.random() * i);
        return randNum;
    }


}
