package java8.Functional_Programming.Questions;
/*
Write a lambda expression that takes two integers and
returns their multiplication. Then, apply this lambda to a
pair of numbers.
 */


import java.util.List;

public class Que1 {
    public static void main(String[] args) {
        List<Integer> number=List.of(1,2,3,4,5);
        int multi=number.stream()
                .reduce(1,(a,b)->a*b);
        System.out.println(multi);
    }
}
