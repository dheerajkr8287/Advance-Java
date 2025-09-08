package COLLECTIONS.Java8Features.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Terminal Operations;
 * Terminal operations are the final operations in a stream pipeline that produce a result or a side effect.
 * They trigger the processing of the stream and can produce various types of results, such as collections,
 * single values, or side effects like printing to the console.
 * return result ->eagerly processed
 * Common terminal operations include:
 * forEach(): Performs an action for each element in the stream.
 * collect(): Collects the elements of the stream into a collection, such as a List or Set.
 * reduce(): Combines the elements of the stream into a single value using an associative accumulation function.
 * count(): Returns the count of elements in the stream.
 * anyMatch(), allMatch(), noneMatch(): Check if any, all, or none of the elements match a given predicate.
 * findFirst(), findAny(): Returns an Optional describing the first
 * min(), max(): Returns the minimum or maximum element according to a provided comparator.
 * toArray(): Converts the stream into an array.
 * forEachOrdered(): Similar to forEach(), but respects the encounter order of the stream.
 * These operations are eager, meaning they process the entire stream and produce a result immediately.
 * Once a terminal operation is invoked, the stream is considered consumed and cannot be reused.
 */
public class terminalOperation {
    public static void main(String[] args) {


        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //collect
        List<Integer> collect = list.stream().skip(2).collect(Collectors.toList());
        List<Integer> collect1 = list.stream().skip(2).toList();
        System.out.println(collect);

        //forEach
        list.stream().forEach(System.out::println);

        //reduce
//        list.stream().reduce((x,y)->x+y);
        Optional<Integer> reduce = list.stream().reduce(Integer::sum);
        System.out.println(reduce.get());

        //count
        long count = list.stream().filter(x -> x % 2 == 0).count();
        System.out.println(count);

        //ANYMATCH, ALLMATCH, NONEMATCH
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        boolean b1 = list.stream().allMatch(x -> x % 2 == 0);
        System.out.println(b1);

        boolean b2 = list.stream().noneMatch(x -> x % 2 == 0);
        System.out.println(b2);

        //findFirst, findAny
        Optional<Integer> first = list.stream().findFirst();
        System.out.println(first.get());
        Optional<Integer> any = list.stream().findAny();
        System.out.println(any.get());

        //min, max
        Optional<Integer> min = list.stream().min((x, y) -> x.compareTo(y));
        System.out.println(min.get());
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println(max.get());
        
        //toArray
        Object[] array = Stream.of(1, 2, 4, 5, 6).toArray();


        // some exmaple

        //filtering and collecting name
        List<String> names= Arrays.asList("Amit","John","Alice","Bob","Annie");
        System.out.println(names.stream().filter(x->x.length()>3).toList());

        //squaring and sorting numbers
        List<Integer> numbers=Arrays.asList(5,3,8,1,2,7);
        System.out.println(numbers.stream().map(x->x*x).sorted().toList());

        //sum
        System.out.println(list.stream().reduce(Integer::sum).get());



        //counting the occurrences of each element
        String str="apple banana apple orange banana apple";
        System.out.println(str.chars().filter(x->x=='l').count());

        List<String> items=Arrays.asList("apple","banana","orange","apple","banana","apple");
        System.out.println(items.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())));



        //Example   :: streams cannot be reused once a terminal operation is invoked on it.
        List<String> names1=Arrays.asList("Amit","John","Alice","Bob","Annie");
        Stream<String> stream = names1.stream();
        stream.forEach(System.out::println);
        List<String> list1=stream.map(String::toUpperCase).toList();//exception

        //forEachordered
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("using forEachOrdered");
        nums.parallelStream().forEachOrdered(System.out::println);
        System.out.println("using forEach");
        nums.stream().forEach(System.out::println);


    }
}
