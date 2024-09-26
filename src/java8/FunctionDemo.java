package java8;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> f=(String s)->s.length();
        System.out.println(f.apply("kakaji"));
    }
}
