package java8.Functional_Programming.OptionalClass;

import java.util.List;
import java.util.Optional;

public class TestingOptionalClass {
    public static void main(String[] args) {
        List<Integer> numbers=List.of();
        Optional<Integer> numSum=numbers.stream()
                .reduce((a,b)->a+b);
        if(numSum.isPresent()){
            System.out.println(numSum.get());
        }
        else{
            System.out.println("List is Empty");
        }
    }
}
