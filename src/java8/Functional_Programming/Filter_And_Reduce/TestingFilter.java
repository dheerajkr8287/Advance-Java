package java8.Functional_Programming.Filter_And_Reduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> friuts=List.of("apple","date","banana","mango","cherry");
        System.out.println(friuts.size());
        System.out.println("Normal way");
        for (String friut : friuts) {
            System.out.println(friut);
        }

        System.out.println("printing by streams");
        friuts.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);

            }
        });

        System.out.println("printing by lambda expression");
        friuts.stream().forEach(friut-> System.out.println(friut));


        System.out.println("printing by using filter");
        friuts.stream()
                .filter(friut->friut.endsWith("e"))
                //terminal operation
                .forEach(friut-> System.out.println(friut));
    }
}
