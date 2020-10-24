package icu.debug.study.tdd;

public class FizzBuzz2 {

    public static String of(Integer i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return i.toString();
    }


    public static void start() {
        for (int i = 1; i <= 100; i++) {
            String res = of(i);
            System.out.println(res);
        }
    }
}
