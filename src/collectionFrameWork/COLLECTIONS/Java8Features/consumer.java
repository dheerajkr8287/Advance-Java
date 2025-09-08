package COLLECTIONS.Java8Features;

import java.util.function.*;
import java.util.function.Predicate;

public class consumer {
    public static void main(String[] args) {
        //Consumer is a functional interface in java.util.function package
        //represents an operation that takes a single input argument and returns no result
        //used for operations like printing, logging, modifying objects
        //core method: void accept(T t)
        //other methods: andThen()

        //Use Consumer when you just want to perform an action on the given input, without returning a result.
        java.util.function.Consumer<String> printName=name-> System.out.println("Hello, "+name);
        printName.accept("Amit");

        java.util.function.Consumer<Integer> doubleIT=num-> System.out.println(num*2);
        doubleIT.accept(5);

        java.util.function.Consumer<Integer> squareIT=num-> System.out.println(num*num);
        doubleIT.andThen(squareIT).accept(5); //10 25

        //Interview Quick Points

        //Consumer is used for operations that don't return a value.
        //Method: accept(T t) → returns void.
        //Can be chained using andThen().
        //Widely used in forEach() in Streams API.
        //Consumer is a Functional Interface
        //not compose() method because it doesn't return any value




        //supplier
        //Supplier is a functional interface in java.util.function package
        //represents a supplier of results
        //used for lazy generation of values or objects
        //core method: T get()
        //other methods: andThen()
        Supplier<String> stringSupplier=()->"Hello from Supplier";
        System.out.println(stringSupplier.get());

        //combined example
       Predicate<Integer> predicate= x->x%2==0;
        Function<Integer,Integer> function= x->x*2;
        Consumer<Integer> consumer= x-> System.out.println("Final Result: "+x);
        Supplier<Integer> supplier=()->100;
        if(predicate.test(supplier.get())){
           consumer.accept(function.apply(supplier.get()));
        }

        //biPredicate biFunction biConsumer
        BiPredicate<Integer,Integer> biPredicate=(a,b)->(a+b)%2==0;
        System.out.println(biPredicate.test(2,4)); //true
        BiConsumer<String ,Integer> BiConsumer=(name,age)-> System.out.println(name+" is "+age+" years old");
        BiConsumer.accept("Amit",25);
        BiFunction<String,String,Integer> biFunction=(x,y)->(x+y).length();
        System.out.println(biFunction.apply("a","bc"));

        //UniaryOperator and BinaryOperator
        //both extend Function interface
        //UnaryOperator takes one argument and returns a result of the same type
        //BinaryOperator takes two arguments of the same type and returns a result of the same type
        UnaryOperator<Integer> unaryOperator=x->x*3;
        System.out.println(unaryOperator.apply(5)); //15
        BinaryOperator<Integer> binaryOperator=(x,y)->x*y;
        System.out.println(binaryOperator.apply(5,4)); //20










    }







}
