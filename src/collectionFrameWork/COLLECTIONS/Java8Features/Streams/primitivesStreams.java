package COLLECTIONS.Java8Features.Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class primitivesStreams {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9,10};
        IntStream stream = Arrays.stream(num);

        System.out.println(IntStream.range(1,6).boxed().collect(Collectors.toList()));
        System.out.println(IntStream.rangeClosed(1,6).boxed().collect(Collectors.toList()));

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);

        IntStream intStream1=new Random().ints(5);
        System.out.println(intStream1.boxed().toList());
    }
}
