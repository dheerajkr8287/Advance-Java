package Generic.GenricClass;

import java.util.ArrayList;

/*
issue before Generics:
-No type Safety
-Manual Casting
-No compile time checking

Generics -type allow you to define a class ,interface or method with placeholder
(type Parameters) for the data types they work with

Why Use Generics?
Type Safety: Prevents ClassCastException at runtime.
Code Reusability: A single generic class or method can be used for different data types.
Compile-Time Checking: Errors are caught at compile time rather than runtime


T:type
E:element(used in collections)
k:key in maps
V:value in maps
N:number
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String > list=new ArrayList<>();
        list.add("Hello");
        list.add("World");
        String s = list.get(0);
        String s1 = list.get(1);


//        Integer i=(Integer) list.get(0);


        Box<Integer> box=new Box<>();
        box.setValue(1);
        Integer value = box.getValue();
        System.out.println(value);



        Pair<String,Integer> pair=new Pair<>("age",30);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());




    }
}
