package java8.Functional_Programming.Filter_And_Reduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> number=List.of(1,2,3,55,5,8);
        int sum=0;
        System.out.println("Normal way");
        for (Integer num : number) {
            sum+=num;

        }
        System.out.println(sum);

        System.out.println("Using functional programming");
     int newSum= number.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer+integer2;
                    }
                });
        System.out.println(newSum);


        System.out.println("Using lambda function");
        int newSum2=number.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(newSum2);



        int max=number.stream()
                .reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
        System.out.printf("Max is using reduce: %d",max);
    }
}
