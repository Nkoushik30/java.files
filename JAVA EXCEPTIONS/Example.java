 import java.util.*;

class Example {
    public static void main(String[] args) {
        try {
            int b = 0, a = 10;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

