package COLLECTIONS.Java8Features;

import java.util.function.Function;

/*
Function<T, R> in Java 8----it work for to you
A functional interface in java.util.function package.
Represents a function that takes one argument of type T and returns a result of type R.
Abstract method:
R apply(T t);

 */
public class functional {
    public static void main(String[] args) {

        Function<Integer,Integer> doubltIT=x->x*2;
        Function<Integer,Integer> tripleIT=x->x*3;
        System.out.println(doubltIT.apply(5)); //10
        System.out.println(tripleIT.apply(5)); //15
        System.out.println(doubltIT.andThen(tripleIT).apply(20));//120
        System.out.println(doubltIT.compose(tripleIT).apply(20));//120
        Function<Integer,Integer> identity = Function.identity();
        System.out.println(identity.apply(50));//50

    }
}

/*
Function<T, R> takes 1 input and produces 1 output.

Method: apply(T t).

Supports function composition via andThen() and compose().

Used heavily in Streams API (map, collect, etc.).
 */