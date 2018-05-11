package cn.z.jiutian.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.testng.annotations.Test;

/*
 * Java 8 新增加的包 java.util.function
 */
public class PredicateTest {

    public static void filter(List<String> names, Predicate condition) {
        for (String name : names) {
            if (condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }

    @Test
    public void predicateTest(){
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Hashkell", "Lisp");

        System.out.println("Languages which starts with J :");
        filter1(languages, (str) -> ((String) str).startsWith("j"));
        
        System.out.println("Languages which ends with a");
        filter1(languages, (str) -> ((String) str).endsWith("a"));
        
        System.out.println("Print all languages");
        filter1(languages, (str) -> true);
        
        System.out.println("Print no languages");
        filter1(languages, (str) -> false);
        
        System.out.println("Print languages whose length greater than 4: ");
        filter1(languages, (str) -> ((String)str).length() > 4);
    }

    public static void filter1(List<String> names, Predicate condition){
        names.stream().filter((name) ->  (condition.test(name))).forEach((name) -> {
            System.out.println(name + " ");
        });
    }
}
