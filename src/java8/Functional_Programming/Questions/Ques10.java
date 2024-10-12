package java8.Functional_Programming.Questions;

import java.util.List;

/*
Create a list of strings representing numbers ("1", "2", ...).
Convert each string to an integer, then again calculating
squares of each number using the map operation and sum
up the resulting integers
 */
public class Ques10 {
    public static void main(String[] args) {
        List<String> number=List.of("1","2","3","4","5");
        number.stream()
                .map(Integer::parseInt)
                .map(num->Math.pow(num,2))
                .reduce(Double::sum)

                .ifPresent(System.out::println);




    }
}
