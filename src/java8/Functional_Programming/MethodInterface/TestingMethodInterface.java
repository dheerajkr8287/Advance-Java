package java8.Functional_Programming.MethodInterface;

import java.util.List;

public class TestingMethodInterface {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7);
        System.out.println("By using Lambda");
        numbers.stream()
                .filter(num->num%2==1)
                .forEach(num-> System.out.println(num));

        System.out.println("By using Method Interface");
        numbers.stream()
                .filter(num->num%2==1)
                .forEach(System.out::println);

        System.out.println("By using Lambda");
        int newSum=numbers.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(newSum);


        System.out.println("Method Interface");
        newSum=numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(newSum);




    }
}
