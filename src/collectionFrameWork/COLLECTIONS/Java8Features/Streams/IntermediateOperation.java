package COLLECTIONS.Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Intermediate Operations in Java Streams
 * intermediate operations are used to transform a stream into another stream.
 * They are lazy and are not executed until a terminal operation is invoked.
 * Common intermediate operations include:
 * - filter(): Filters elements based on a predicate.
 * - map(): Transforms each element using a function.
 * - sorted(): Sorts the elements in natural order or using a comparator.
 * - distinct(): Removes duplicate elements.
 * - limit(): Limits the number of elements in the stream.
 * - skip(): Skips the first n elements in the stream.
 *  * flatMap(): Flattens a stream of collections into a single stream of elements.
 *  What does flatMap do?
 * It’s used when each element in your stream is itself a collection (or another stream), and you want to “flatten” them into a single stream.
 * - peek(): Performs an action on each element as it is consumed from the stream.
 * iterate() and generate() are also intermediate operations that create infinite streams.
 */
public class IntermediateOperation {

    public static void main(String[] args) {


        //filter

        List<String> list= Arrays.asList("Amit","Raju","Sita","Gita" );
        Stream<String> a = list.stream().filter(x -> x.startsWith("A"));
        //no filtering at this point, just a pipeline setup .it run when terminal operation is invoked
        long count = a.count();
        System.out.println(count);

        //map
        //Stream<String> stringStream = list.stream().map(x -> x.toUpperCase());
        Stream<String> stringStream = list.stream().map(String::toUpperCase);

         // sorted
        Stream<String> sorted = list.stream().sorted();
        Stream<String> sorted1 = list.stream().sorted((c, b) -> c.length() - b.length());

        //distinct
        Stream<String> a1 = list.stream().filter(x -> x.startsWith("A")).distinct();
        long count1 = a1.count();
        System.out.println("distinct:"+count1);


        //limit
        Stream<Integer> limit = Stream.iterate(1, x -> x + 1).limit(100);
        limit.forEach(System.out::println);
//        System.out.println(limit.count());



        //skip
        Stream<Integer> skip=Stream.iterate(1,x->x+1).skip(10).limit(100);
        System.out.println(skip.count());

        //peek
        Stream.iterate(1,x->x+1).skip(10).limit(100).peek(System.out::println);

        //flatmap :handle stream of collections ,list  or arrays where each element is itself a collection
        //flatten nested structure into a single stream of elements
        //transform each collection into a stream and then flatten them into a single stream at the same time
        List<List<Integer>> nestedList=Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );
        System.out.println("nested list:"+nestedList.get(1).get(1));//5
        System.out.println(nestedList.stream().flatMap(x->x.stream()).map(x->x*x).toList());

        List<String> sentences=Arrays.asList("Hello World","Java Streams","FlatMap Example");
        System.out.println(sentences.stream().flatMap(sen->Arrays.stream(sen.split(" "))).toList());
    }
}
