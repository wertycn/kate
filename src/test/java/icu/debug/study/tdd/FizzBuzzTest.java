package icu.debug.study.tdd;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.annotation.Documented;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    @DisplayName("应该有一个FizzBuzz类")
    public void should_have_FizzBuzz_class() {
        FizzBuzz fizzBuzz = getFizzBuzz();
    }

    @Test
    @DisplayName("应该有一个run方法，接收一个int参数，返回一个string数据")
    public void should_have_run_method() {
        FizzBuzz fizzBuzz = getFizzBuzz();
        String res = fizzBuzz.run(1);
    }

    @Test
    @DisplayName("RUN 方法输入1应该返回1")
    public void run_method_shoud_into_1_return_1() {
        FizzBuzz fizzBuzz = getFizzBuzz();
        String res = fizzBuzz.run(1);
        assertEquals(res, "1");
    }

    private FizzBuzz getFizzBuzz() {
        return new FizzBuzz();
    }

    @ParameterizedTest(name = "run 方法应该输入{0}返回{1}")
    @CsvSource({
            "1,'1'",
            "2,'2'",
            "3,'Fizz'",
            "4,'4'",
            "5,'Buzz'",
            "15,'FizzBuzz'",
            "55,'Buzz'",
    })
    @DisplayName("run方法输入输出测试")
    public void test_run_method(int i, String targetResult) {
        String res = this.getFizzBuzz().run(i);
        assertEquals(res, targetResult);
    }
}
