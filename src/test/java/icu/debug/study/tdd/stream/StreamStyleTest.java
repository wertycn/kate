package icu.debug.study.tdd.stream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamStyleTest {

    @Test
    @DisplayName("stream特性尝试 filter")
    public void testStreamFilterApi() {
        ArrayList<String> list = getTestList();
        List<String> list2 =  list.stream().filter(getStringPredicate()).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list2);
    }

    private ArrayList<String> getTestList() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        return list;
    }

    private Predicate<String> getStringPredicate() {
        return st -> st.equals("2");
    }


    @Test
    @DisplayName("stream map 特性尝试")
    public void testStreamMapApi() {
        ArrayList<String> list = getTestList();
        //
        Function<String, String> stringStringFunction = s -> getStaticTest(s);
        List<String> list2 = streamMethod(list, stringStringFunction);
        ArrayList<String> list3 = (ArrayList<String>)list.stream().map(s -> "--1").collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
    }

    private List<String> streamMethod(ArrayList<String> list, Function<String, String> stringStringFunction) {
        return list.stream().map(stringStringFunction).collect(Collectors.toList());
    }

    public static String getStaticTest(String s) {
        return "test" + s;
    }
}