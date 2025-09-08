package COLLECTIONS.Java8Features;

public class Predicate {
    public static void main(String[] args) {
        //Predicate is a functional interface in java.util.function package
        //represents a single argument function that returns a boolean value
        //used for conditional checks and filtering data
        //core method: boolean test(T t)
        //other methods: and(),or(),negate()


        java.util.function.Predicate<Integer> isEven= num-> num % 2==0;
//        System.out.println(isEven.test(4)); //true

        java.util.function.Predicate<String> isWordStartWithA= x->x.startsWith("A");
        java.util.function.Predicate<String> isWordEndWithT= x->x.endsWith("T");
        java.util.function.Predicate<String> and = isWordStartWithA.and(isWordEndWithT);
        System.out.println(and.test("AmiT")); //true
        System.out.println(and.test("Ankit")); //false

        //Interview Quick Points

        //Predicate is used for conditional checks (true/false).
        //Method: test(T t) → returns boolean.
        //Can be combined using and(), or(), negate().
        //Widely used in Streams API filter().
        //Predicate is a Functional Interface


    }
}
