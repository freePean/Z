package cn.z.jiutian.guava;

import com.google.common.base.Optional;


public class OptionalTest {

    public static void main(String[] args) {
        //OptionalTest optional = new OptionalTest();
        Integer validateValue = null;
        Optional<Integer> a = Optional.of(validateValue);
        Optional<Integer> b = Optional.of(new Integer(10));
        System.out.println(sum(a,b));
    }

    public static Integer sum(Optional<Integer> args0, Optional<Integer> args1){
        return args0.get() + args1.get();
    }

}
