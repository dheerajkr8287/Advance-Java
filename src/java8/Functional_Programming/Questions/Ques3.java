package java8.Functional_Programming.Questions;

import java.util.Arrays;
import java.util.List;

/*
.Given a list of strings, use stream operations to filter out
strings that have length of 10 or more and the  n
concatenate the remaining strings.
 */
public class Ques3 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Dog","Bull","Bitch","cow","Lion","Elephant","MountainsLeopard","living in only cold");
       String result= list.stream()
                .filter(animal->animal.length()>10)
               .reduce("",(a,b)->a+" "+b);
        System.out.println(result);



    }
}
