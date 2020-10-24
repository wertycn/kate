package icu.debug.study.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzz2Test {
    @Test
    @DisplayName("应该有一个FizzBuzz2类")
    public void should_have_FizzBuzz2_class() {
        FizzBuzz2 fizzBuzz2 = new FizzBuzz2();
    }

    @Test
    @DisplayName("of方法应该输入1返回1")
    public void should_have_method_return_1_input_1() {
        FizzBuzz2 fizzBuzz2 = new FizzBuzz2();
        String res = fizzBuzz2.of(1);
        assertEquals(res, "1");
    }

    @Test
    @DisplayName("of方法应该输入2返回2")
    public void method_of_should_input_2_return_2() {
        assertEquals(FizzBuzz2.of(2), "2");
    }

    @Test
    @DisplayName("of方法应该输入3返回Fizz")
    public void method_of_should_input_3_return_Fizz() {
        assertEquals(FizzBuzz2.of(3), "Fizz");
    }

    @Test
    @DisplayName("of方法应该输入5返回Buzz")
    public void method_of_should_input_5_return_Buzz() {
        assertEquals(FizzBuzz2.of(5), "Buzz");
    }

    @Test
    @DisplayName("of方法应该输入15返回FizzBuzz")
    public void method_of_should_input_15_return_FizzBuzz() {
        assertEquals(FizzBuzz2.of(15), "FizzBuzz");
    }

    @Test
    @DisplayName("of 方法应该输入25返回Buzz")
    public void method_of_should_input_25_return_Buzz() {
        assertEquals(FizzBuzz2.of(25), "Buzz");
    }

    @Test
    @DisplayName("应该有一个start方法循环输出")
    public void should_have_method_start_loop_out() {
        FizzBuzz2.start();
    }
}
