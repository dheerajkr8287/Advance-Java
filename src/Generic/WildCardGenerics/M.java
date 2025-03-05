package Generic.WildCardGenerics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//in java generics ,wildcard (?) are special kind of type argument that can be used in method argument and class defination to represents an unknow type.
//they allow for more flexible and dynamic by letting the type be specifed later or be more lossly defined
//this is use in read only secenrio
public class M {
    public static  double sum(List<? extends Number> numbers){
        double sum=0;
        for (Number o:numbers){
            sum+=o.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {

        List<? super Integer> numbers= Arrays.asList(1,2,3);
        numbers.add(null);
        numbers.add(12);

    }
}


/*
java does not support generic exceptions due to type erasure.
Type erasure removes generic type information at runtime, which
means that the specific type parameters are not available during execution.
Since exceptions are closely tied to runtime operations, you can't have a
 generic exception like <T extends Exception> because the type information
 would be erased and not available at runtime.

If you want to handle exceptions in a generic way, you can catch specific
exceptions or use a common superclass like Exception or Throwable,
but you won't be able to directly use a generic type for exceptions.
 */