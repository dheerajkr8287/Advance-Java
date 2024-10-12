package java8.Functional_Programming.Questions;
/*
Write two versions of a program that calculates the factorial
of a number: one using structural (procedural) programming,
and the other using functional programming.
 */

import java.util.stream.IntStream;

public class Ques6 {
    public static long factorial(int num){
        if(num==0 || num==1){
            return  1;
        }
        long fact=1;
        for (int i = 2; i <=num; i++) {
            fact*=i;

        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("factorial using two way");
        int number=5;
        System.out.println("factorial by structural");
        System.out.println(factorial(number));

        System.out.println("Factorial by function programming");
        IntStream.rangeClosed(2,number)
                .reduce((a,b)->a*b)
                .ifPresent(System.out::println);


    }
}
