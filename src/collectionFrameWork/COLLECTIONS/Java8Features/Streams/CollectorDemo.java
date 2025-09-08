package COLLECTIONS.Java8Features.Streams;

import javax.lang.model.element.Name;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Collectors is Utility class in java.util.stream package
 * Provides various static methods to create Collector instances
 * Used to accumulate elements of a stream into a collection or other data structures
 * Provides a set of method to creates common collectors
 * Commonly used collectors include:
 * - toList(): Collects elements into a List.
 * - toSet(): Collects elements into a Set.
 * - toMap(): Collects elements into a Map.
 * - joining(): Concatenates elements into a single String.
 * - groupingBy(): Groups elements based on a classifier function.
 * - partitioningBy(): Partitions elements into two groups based on a predicate.
 * - counting(): Counts the number of elements.
 * - summingInt(), summingDouble(), summingLong(): Sums numeric values.
 * - averagingInt(), averagingDouble(), averagingLong(): Averages numeric values.
 * - reducing(): Performs a reduction operation on the elements.
 * Collectors can be combined using the Collector.of() method to create custom collectors.
 * Collectors are typically used as the argument to the collect() method of a Stream.
 * Example:
 */
public class CollectorDemo {
    public static void main(String[] args) {
        //collecting to list
        List<Integer> list= Arrays.asList(1,1,2,3,2,4,5,6,7,8,9,10);
        List<Integer> collect = list.stream()
                .filter(x -> x % 2 == 0)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);

        //collecting to set
        Set<Integer> collect1 = list.stream()
                .collect(Collectors.toSet());
        System.out.println(collect1);


        //collection to specific collection
        ArrayList<Integer> collect2 = list.stream()
                .collect(Collectors.toCollection(() -> new ArrayList<>()));
        System.out.println(collect2);

        //joining
        List<String> names=Arrays.asList("Amit","Raju","Sita","Gita" );
        String collect3 = names.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(collect3);

        //summarizing data :generate summary statistics (count, sum, min, average, max)
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        IntSummaryStatistics collect4 = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count: "+collect4.getCount());
        System.out.println("Sum: "+collect4.getSum());
        System.out.println("Min: "+collect4.getMin());
        System.out.println("Average: "+collect4.getAverage());
        System.out.println("Max: "+collect4.getMax());

        Double collect5 = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(collect5);

        //grouping by
        List<String> people= Arrays.asList("Amit","Raju","Sita","Gita","Ram","Shyam" );
        Map<Integer, List<String>> collect6 = people.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect6);
        System.out.println(people.stream().collect(Collectors.groupingBy(String::length,Collectors.joining())));
        System.out.println(people.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
        TreeMap<Integer, String> collect7 = people.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.joining(",")));
        System.out.println(collect7);


        //partitioning by
        Map<Boolean, List<String>> collect8 = people.stream().collect(Collectors.partitioningBy(x -> x.length() > 4));
        System.out.println(collect8);

        //mapping and collecting
        //applies a mapping function to each element before collecting
        List<String> collect9 = people.stream().collect(Collectors.mapping(String::toUpperCase, Collectors.toList()));
        System.out.println(collect9);



        //Example:


        //collecting name by length
        List<String > names1= Arrays.asList("Amit","John","Alice","Bob","Annie");
        Map<Integer, List<String>> collect10 = names1.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect10);

        //counting word occurence
        String str="apple banana apple orange banana apple";
        Map<String, Long> collect11 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect11);

        //even or odd
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>> collect12 = nums.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(collect12);

        //summing of value
        Map<String, Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",30);
        System.out.println(map.values().stream().reduce(Integer::sum).get());


        //creating a map from a stream element
        //toMap() collector is used to create a map from stream elements
        //it takes two functions as arguments: one for the key and one for the value

        List<String> items=Arrays.asList("apple","banana","orange");
        Map<String, Integer> collect13 = items.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length()));
        System.out.println(collect13);

        List<String> items1=Arrays.asList("apple","banana","orange","apple","banana","apple");
        System.out.println(items1.stream().collect(Collectors.toMap(k->k,v->1,(x,y)->x+y)));


    }
}
