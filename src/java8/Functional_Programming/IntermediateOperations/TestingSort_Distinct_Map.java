package java8.Functional_Programming.IntermediateOperations;
/*
 Intermediate Operations
 1. Laziness: Executed only when a terminal operation is invoked, setting
up a pipeline without processing data.
 2. Stream Transformation: Transform one stream into another, e.g.,
filter, map. They're chainable, allowing multiple transformations.
 3. State Handling: Can be stateless (like map) or stateful(like sorted),
affecting processing



  1. sorted() orders the elements of a stream
based on their natural order or a provided
comparator.
 2.distinct() filters out duplicate elements,
ensuring that every element in the resulting
stream is unique.
 3.map() applies a function to each element of a
stream, transforming them into a new stream
of results based on the function logic




 */
import java.util.List;
import java.util.stream.Collectors;

public class TestingSort_Distinct_Map {
    public static void main(String[] args) {
        List<Integer> number=List.of(4,2,5,6,3);
        System.out.println("---->Uisng sort():");
        List<Integer> sortedNumber=number.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumber);


        System.out.println("by using Distinct");
        List<String> distinctItems=List.of("apple","banana","orange","apple");
        List<String>items=distinctItems.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(items);


        System.out.println("by using Map");
        List<String> word=List.of("raju","kaka","wax");
        List<String> uppercase=word.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercase);
    }
}
