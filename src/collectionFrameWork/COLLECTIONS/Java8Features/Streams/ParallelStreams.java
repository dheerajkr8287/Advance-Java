package COLLECTIONS.Java8Features.Streams;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * A parallel stream is a type of stream in Java that allows for parallel processing of data.
 * It divides the data into multiple segments and processes them concurrently using multiple threads.
 * This can lead to significant performance improvements for large datasets and computationally intensive operations.'
 * Parallel streams are part of the Java Streams API introduced in Java 8.
 * They can be created from collections, arrays, or other data sources by calling the parallelStream() method.
 * Parallel streams automatically manage the underlying threads and handle the splitting and merging of data.
 * However, they may not always be faster than sequential streams, especially for small datasets or simple operations,
 * due to the overhead of managing multiple threads.
 * It's important to consider thread-safety and potential side effects when using parallel streams.
 * Workloads is distributed across multiple CPU cores, making them suitable for CPU-bound tasks.
 * Parallel streams are most effective with large datasets and complex operations.
 * They may not provide performance benefits for small datasets or simple operations due to overhead.
 *
 */
public class ParallelStreams {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        List<Integer> number= Stream.iterate(1,x->x+1).limit(10000).toList();
        List<Long> factorialList = number.stream().map(ParallelStreams::factorial).toList();
        long endTime=System.currentTimeMillis();
        System.out.println("Time taken in sequential stream: "+(endTime-startTime)+" ms");
//        System.out.println(factorialList);


        long startTime1=System.currentTimeMillis();
        List<Long> factorialList1 = number.parallelStream().map(ParallelStreams::factorial).toList();
        long endTime1=System.currentTimeMillis();
        System.out.println("Time taken in parallel stream: "+(endTime1-startTime1)+" ms");


        //cumulative sum
//        [1,2,3,4]->[1,3,6,10]

        List<Integer> numbers= List.of(1,2,3,4);
        AtomicInteger sum=new AtomicInteger(0);
//        List<Integer> cumulativeSum = numbers.parallelStream().map(n -> sum.addAndGet(n)).toList();
        List<Integer> cumulativeSum = numbers.stream().map(sum::addAndGet).toList();
//        List<Integer> cumulativeSum = numbers.stream().map(sum::addAndGet).sequential().toList();

        System.out.println(cumulativeSum); // [1, 3, 6, 10]
    }

    public static long factorial(int n){
        long result=1;
        for(int i=2;i<=n;i++){
            result*=i;
        }
        return result;
    }
}
