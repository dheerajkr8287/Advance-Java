package java8.Functional_Programming.TerminalOperations;
/*
 Terminal Operations
 1. Computation Trigger: Initiates the stream processing and closes the
stream. After this, the stream can't be reused.
 2. Final Outcome: Produces a result (like a sum or list) or a side-effect
(like printing each element). Not chainable.
 3. Examples: Operations like collect, forEach, reduce, sum, max, min,
and count are terminal



1. max() finds the largest element in
the stream according to a given
comparator or natural ordering.
 2.min() identifies the smallest element
in the stream based on a provided
comparator or natural ordering.
 3.collect(Collectors.toList()) gathers
all the elements of the stream into a
new List.
 */
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestingMax_Min_collectToList {
    public static void main(String[] args) {
        List<Integer> number=List.of(4,2,5,6,3);
        System.out.println("Finding Max");
        Optional<Integer> maxNumber=number.stream()
                .max(Integer::compareTo);
        maxNumber.ifPresent(System.out::println);


        System.out.println("Finding Min");
        Optional<Integer> minNumber=number.stream()
                .min(Integer::compareTo);
        minNumber.ifPresent(System.out::println);

        System.out.println("Collect to List");
        List<String> words= Arrays.asList("Stream","Operations","Java");
        List<String> collectionWords=words.stream()
                .collect(Collectors.toList());
        System.out.println(collectionWords);

    }
}
