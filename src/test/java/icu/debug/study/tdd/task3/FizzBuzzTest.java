package icu.debug.study.tdd.task3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    @DisplayName("应该有一个FizzBuzz类")
    public void shouldHaveFizzBuzzClass() {
        FizzBuzz aFizzBuzz = new FizzBuzz();
    }

    @Test
    @DisplayName("应该有一个say方法,输入一个数字，返回一个字符串")
    public void should_have_say_method() {
        assertEquals(FizzBuzz.say(1),"1");
    }

    @Test
    @DisplayName("say输入2返回2")
    public void should_say_2_when_2() {
        assertEquals(FizzBuzz.say(2),"2");
    }

    @Test
    @DisplayName("应该输入3返回Fizz")
    public void should_say_3_when_Fizz() {
        assertEquals(FizzBuzz.say(3),"Fizz");
    }

    @Test
    @DisplayName("应该输入5返回Buzz")
    public void should_say_5_when_Buzz() {
        assertEquals(FizzBuzz.say(5),"Buzz");
    }

    @Test
    @DisplayName("应该输入15返回FizzBuzz")
    public void should_say_15_when_FizzBuzz() {
        assertEquals(FizzBuzz.say(15),"FizzBuzz");
    }

}