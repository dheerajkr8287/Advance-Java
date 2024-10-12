package java8.Functional_Programming.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
3.Given an array of integers, create a stream, use the distinct
operation to remove duplicates, and collect the result into
a new list
 */
public class Ques8 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,4,5,3,2,5,67,7);
        List<Integer> arr=list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(arr);

    }
}
