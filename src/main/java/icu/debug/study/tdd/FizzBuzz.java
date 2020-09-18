package icu.debug.study.tdd;

public class FizzBuzz {
    public static String run(Integer i) {
        if (i % 15 == 0) {
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
}
