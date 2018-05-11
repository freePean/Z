package cn.z.jiutian.lambda;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class ListForEachTest {

    /*
     * java 8 之前
     */
    @Test
    public void listForEachTest() {
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        for (String str : features) {
            System.out.println(str);
        }
    }

    /*
     * java 8 之后
     */
    @Test
    public void listForEachJava8Test() {
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n -> System.out.println(n));

        System.out.println("----------===========-------------");
        
        // 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示，
        // 看起来像C++的作用域解析运算符
        features.forEach(System.out::println);
    }
}
