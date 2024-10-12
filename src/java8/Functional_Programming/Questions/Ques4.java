package java8.Functional_Programming.Questions;

import java.util.List;

/*
Given a list of integers, use stream operations to filter odd
numbers and print them.

 */
public class Ques4 {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,4,5,6,7,8);
       list.stream()
                 .filter(num->num%2!=0)
                .forEach(num-> System.out.println(num));

    }
}
