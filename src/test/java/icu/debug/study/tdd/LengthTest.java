package icu.debug.study.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 单位转换测试驱动开发
 */
public class LengthTest {

    @Test
    @DisplayName("应该有一个LengthTool对象,接收两个实例化参数，长度值和单位")
    public void should_have_unit_of_method() {
        LengthTool length = new LengthTool(1, Unit.Inch);
    }

    @Test
    @DisplayName("1英寸应该等于1英寸")
    public void should_1_inch_equal_1_inch() {
        LengthTool lengthTool = new LengthTool(1, Unit.Inch);
        assertEquals(lengthTool, new LengthTool(1, Unit.Inch));
    }

    @Test
    @DisplayName("1英尺应该等于12英寸")
    public void should_1_foot_equal_12_inch() {
        LengthTool lengthTool = new LengthTool(1, Unit.Foot);
        assertEquals(lengthTool, new LengthTool(12, Unit.Inch));
    }

    @Test
    @DisplayName("1码应该等于36英寸")
    public void should_1_yard_equal_36_inch() {
        LengthTool lengthTool = new LengthTool(1, Unit.Yard);
        assertEquals(lengthTool, new LengthTool(36, Unit.Inch));
    }

    @Test
    @DisplayName("1码应该等于3英尺")
    public void should_1_yard_equal_3_foot() {
        LengthTool lengthTool = new LengthTool(1, Unit.Yard);
        assertEquals(lengthTool, new LengthTool(3, Unit.Foot));
    }


    @Test
    @DisplayName("应该有个方法将单位输出为目标单位值")
    public void  should_toUnit_method_out_target_unit_value() {
        LengthTool lengthTool = new LengthTool(100, Unit.Inch);
        float inchVal = lengthTool.toUnit(Unit.Inch);
        float footVal = lengthTool.toUnit(Unit.Foot);
        System.out.println(inchVal);
        System.out.println(footVal);
        assertEquals(lengthTool,new LengthTool(inchVal,Unit.Inch));
        assertEquals(lengthTool,new LengthTool(footVal,Unit.Foot));

    }
}
