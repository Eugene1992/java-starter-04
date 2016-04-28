import java.util.Scanner;

/**
 * Created by Student on 4/22/2016.
 */
public class Hw06 {
    /*
1. Написать программу консольной авторизации.

     */
    public static void main(String[] args) {
        String[] users = new String[]{"Dima", "qwer12", "Nata", "qwer13", "Kost", "asdf45"};
        String login = "";
        String password = "";
        for (; !login.equals("Exit"); ) {
            System.out.println("Введите логин.");
            Scanner scan = new Scanner(System.in);
            login = scan.next();
            if (login.equals(users[0])) {
                System.out.println("Введите пароль.");
                scan = new Scanner(System.in);
                password = scan.next();
                if (password.equals(users[1])) {
                    System.out.println("Добро пожаловать!");
                } else
                    System.out.println("Неправельный пароль!");
            } else if (login.equals(users[2])) {
                System.out.println("Введите пароль.");
                scan = new Scanner(System.in);
                password = scan.next();
                if (password.equals(users[3])) {
                    System.out.println("Добро пожаловать!");
                } else
                    System.out.println("Неправельный пароль!");
            } else if (login.equals(users[4])) {
                System.out.println("Введите пароль.");
                scan = new Scanner(System.in);
                password = scan.next();
                if (password.equals(users[5])) {
                    System.out.println("Добро пожаловать!");
                }

            }else{
                System.out.println("Неверный логин, попробуйте еще раз!");
            }
        }

    }
}

