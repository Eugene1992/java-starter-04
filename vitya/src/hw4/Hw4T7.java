package hw4;

/**
 * Created by User on 08.05.2016.
 */
public class Hw4T7 {
    public static void main(String[] args) {
        //7. Выведите в консоль "шахматную доску" размером 32х32 знаков(пробелы не учитывать).
        String a = "Ж ";
        String b = "- ";
        String c = "";
        String d = "";
        while (c.length() < 64) {
            while (c.length() < 7) {
                c = c + a;
            }
            while (c.length() > 6 & c.length() < 15) {
                c = c + b;
            }
            while (c.length() > 15 & c.length() < 24) {
                c = c + a;
            }
            while (c.length() > 23 & c.length() < 32) {
                c = c + b;
            }
            while (c.length() > 31 & c.length() < 40) {
                c = c + a;
            }
            while (c.length() > 39 & c.length() < 48) {
                c = c + b;
            }
            while (c.length() > 47 & c.length() < 56) {
                c = c + a;
            }
            while (c.length() > 55 & c.length() < 64) {
                c = c + b;
            }

            while (d.length() < 64) {
                while (d.length() < 7) {
                    d = d + b;
                }
                while (d.length() > 6 & d.length() < 15) {
                    d = d + a;
                }
                while (d.length() > 15 & d.length() < 24) {
                    d = d + b;
                }
                while (d.length() > 23 & d.length() < 32) {
                    d = d + a;
                }
                while (d.length() > 31 & d.length() < 40) {
                    d = d + b;
                }
                while (d.length() > 39 & d.length() < 48) {
                    d = d + a;
                }
                while (d.length() > 47 & d.length() < 56) {
                    d = d + b;
                }
                while (d.length() > 55 & d.length() < 64) {
                    d = d + a;
                }

                for (int i = 0; i < 32; i++) {
                    if (i < 4) {
                        System.out.println(c);
                    }
                    if (i >= 4 & i < 8) {
                        System.out.println(d);
                    }
                    if (i >= 8 & i < 12) {
                        System.out.println(c);
                    }
                    if (i >= 12 & i < 16) {
                        System.out.println(d);
                    }
                    if (i >= 16 & i < 20) {
                        System.out.println(c);
                    }
                    if (i >= 20 & i < 24) {
                        System.out.println(d);
                    }
                    if (i >= 24 & i < 28) {
                        System.out.println(c);
                    }
                    if (i >= 28 & i < 32) {
                        System.out.println(d);
                    }
                }
            }
        }
    }
}
