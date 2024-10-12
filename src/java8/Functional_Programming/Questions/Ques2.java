package java8.Functional_Programming.Questions;

import java.util.List;

/*
7.Convert an array of strings into a stream. Then, use the
stream to print each string to the console.
 */
public class Ques2 {
    public static void main(String[] args) {
        List<String> list=List.of("kaka","raja","aja","soja");
        list.stream().forEach(str-> System.out.println(str));
    }
}
