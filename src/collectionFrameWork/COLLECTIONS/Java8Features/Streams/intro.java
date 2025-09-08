package COLLECTIONS.Java8Features.Streams;

import java.util.List;

/**
 * Streams in features Java 8
 * it is process of collection of data in a functional and declarative way
 * it is simpilify data processing
 * embrance functional programming
 * improve code readability
 * enhance performance with parallel processing
 * A Stream in Java 8 is a sequence of objects that supports functional-style operations.
 * It is not a data structure; instead, it takes input from Collections, Arrays, or I/O channels.
 *It allows declarative programming (like SQL) instead of writing imperative loops.
 *
 *
 * HOW TO USE STREAMS
 * source->intermediate operations->terminal operations
 *
 *
 * Characteristics of Streams:
 *
 * No storage → Doesn’t store elements, only processes them.
 *
 * Functional → Operations produce a result without modifying the source.
 *
 * Laziness → Operations are executed only when needed (e.g., terminal operation).
 *
 * Possibly unbounded → Can work with infinite sequences.
 *
 * Consumable → Once consumed, you can’t reuse the same stream.
 *
 *
 */


public class intro {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.println(count); //5
        //using stream
        long count1 = numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println(count1);

    }
}


//statefull vs stateless
// statefull operation need to remember the state of the previous element
// stateless operation do not need to remember the state of the previous element
// example of statefull operation is sorted() and distinct()
// example of stateless operation is filter() and map()