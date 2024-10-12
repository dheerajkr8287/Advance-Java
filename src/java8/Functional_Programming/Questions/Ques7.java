package java8.Functional_Programming.Questions;

import java.util.Optional;

/*
Write a function that accepts a string and returns an
Optional<String>. If the string is empty or null, return an
empty Optional, otherwise, return an Optional containing the
uppercase version of the string.

 */
public class Ques7 {
    public static void main(String[] args) {

        System.out.println(toOptional(null));
        System.out.println(toOptional(""));
        System.out.println("dheru");
    }
    public static Optional<String> toOptional(String str){
        if(str==null || str.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}
