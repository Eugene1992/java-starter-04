package ref;

import java.util.ArrayList;
import java.util.List;

public class GC {
    static class GBexample1 {
        public static void main(String[] args) {
            byte[] s = new byte[Integer.MAX_VALUE];
        }
    }

    static class GBexample2 {
        public static void main(String[] args) {
            while (true){
                new Object();
            }
        }
    }

    static class GBexample3 {
        public static void main(String[] args) {
            while (true){
                new Object();
            }
        }
    }

    static class GBexample4 {
        public static void main(String[] args) {
            Object obj;
            while (true){
                obj = new Object();
            }
        }
    }

    static class GBexample5 {
        public static void main(String[] args) {
            List<Double> objects = new ArrayList<>();
            while (true){
                objects.add(10.0);
            }
        }
    }

    static class GBexample6 {
        public static void main(String[] args) {
            Object[] ref = new Object[1];
            while (true){
                Object[] a = new Object[1];
                Object[] b = new Object[1];
                a[0] = b;
                b[0] = a;
                ref[0] = a;
            }
        }
    }
}
