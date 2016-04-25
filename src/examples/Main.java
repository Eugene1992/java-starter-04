import java.io.IOException;

        import static other.test.Test.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //runTest();
        //getFortuneTickets();
        //System.out.println(checkTheerteen());
        //System.out.println(checkTheerteen2());
        /*clock();
        System.out.println("----------------------------");
        clock2();*/
        chessDesk();
    }

    public static int getFortuneTickets(){
        int count = 0;
        int n1, n2, n3, n4, n5, n6;
        for (int i = 1; i < 1000000; i++) {
            n1 = i / 100000 % 10;
            n2 = i / 10000 % 10;
            n3 = i / 1000 % 10;
            n4 = i / 100 % 10;
            n5 = i / 10 % 10;
            n6 = i % 10;

            if (n1 + n2 + n3 == n4 + n5 + n6) {
                count++;
            }
        }
        return count;
    }

    public static int checkTheerteen() {
        int count = 0;
        for (int i = 1; i < 1000000; i++) {
            String s = String.valueOf(i);
            if (s.contains("13")){
                count++;
            }
        }
        return count;
    }

    public static int checkTheerteen2() {
        int count = 0;
        int n1, n2, n3, n4, n5, n6;
        for (int i = 1; i < 1000000; i++) {
            n1 = i / 100000 % 10;
            n2 = i / 10000 % 10;
            n3 = i / 1000 % 10;
            n4 = i / 100 % 10;
            n5 = i / 10 % 10;
            n6 = i % 10;
            if ((n1 + n2 == 4 && (n1 == 1 || n2 == 3)) ||
                (n2 + n3 == 4 && (n2 == 1 || n3 == 3)) ||
                (n3 + n4 == 4 && (n3 == 1 || n4 == 3)) ||
                (n4 + n5 == 4 && (n4 == 1 || n5 == 3)) ||
                (n5 + n6 == 4 && (n5 == 1 || n6 == 3))
            ){
                count++;
            }
        }
        return count;
    }

    public static void clock() throws InterruptedException {
        String curTime;
        String hh, mm;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                if (h < 10 && m > 9) {
                    curTime = "0" + h + ":" + m;
                    hh = "0" + h;
                    mm = "" + m;
                } else
                if (h < 10 && m < 10) {
                    curTime = "0" + h + ":0" + m;
                    hh = "0" + h;
                    mm = "0" + m;
                } else
                if (h > 10 && m < 10) {
                    curTime = h + ":0" + m;
                    hh = "" + h;
                    mm = "0" + m;
                } else {
                    curTime = h + ":" + m;
                    hh = "" + h;
                    mm = "" + m;
                }
                if (mm.equals(new StringBuilder(hh).reverse().toString()) || hh.equals(new StringBuilder(mm).reverse().toString())) {
                    System.out.println(curTime);
                }
            }
        }
    }

    public static void clock2() throws InterruptedException {
        int hh1, hh2, mm1, mm2;

        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                mm2 = (m > 9) ? m % 10 : m;
                mm1 = (m > 9) ? m / 10 : 0;
                hh2 = (h > 9) ? h % 10 : h;
                hh1 = (h > 9) ? h / 10 : 0;
                if (hh1 == mm2 && hh2 == mm1) {
                    System.out.println(hh1 + "" + hh2 + ":" + mm1 + "" + mm2);
                }
            }
        }
    }

    public static void chessDesk(){
        for (int i = 0; i <= 31; i++) {
                for (int j = 0; j <= 31; j++) {
                    if (i % 8 <= 3) {
                        if (j % 8 <= 3) {
                            System.out.print("Ж ");
                        }
                        else {
                            System.out.print("- ");
                        }
                    } else {
                        if (j % 8 <= 3) {
                            System.out.print("- ");
                        }
                        else {
                            System.out.print("Ж ");
                        }
                    }
                }
                System.out.println();
        }
    }
}
