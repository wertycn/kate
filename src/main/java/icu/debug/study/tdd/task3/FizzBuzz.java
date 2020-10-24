package icu.debug.study.tdd.task3;

public class FizzBuzz {

    public static String say(Integer number) {
        String result = "";
        if(number % 3 == 0) {
            result = result +  "Fizz";
        }
        if (number % 5 == 0) {
            result = result +  "Buzz";
        }
        if ("".equals(result)) {
            result = number.toString();
        }
        return result;
    }
}
