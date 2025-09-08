package COLLECTIONS.Map;

import java.util.Map;

/*
ImmutableMap is an unmodifiable map — once it’s created, you cannot add, remove, or change its entries.

Java itself doesn’t have a direct ImmutableMap class in java.util, but you can create immutable maps in two main ways:

Using Java’s built-in Map.of() / Map.ofEntries() (Java 9+)

1. Why Use Immutable Maps?
Thread-safety → No modifications mean no concurrent modification issues.

Reliability → Prevents accidental changes.

Performance → Can be optimized internally since data never changes.

. Key Points
No null keys or values when using Map.of()

Immutable means:

You cannot put()

You cannot remove()

You cannot clear()

Attempting modifications → UnsupportedOperationException

 */
public class ImmutableMapDemo {
    public static void main(String[] args) {
        // Using Map.of() to create an immutable map only with a ten entries
        Map<Integer, String> integerStringMap = Map.of(
                1, "A",
                2, "B",
                3, "C"
        );
        System.out.println(integerStringMap);
//        integerStringMap.put(4, "D"); // Throws UnsupportedOperationException

        // Using Map.ofEntries() for more complex entries
        Map<String, Integer> stringIntegerMap = Map.ofEntries(
                Map.entry("One", 1),
                Map.entry("Two", 2),
                Map.entry("Three", 3)
        );
        System.out.println(stringIntegerMap);






    }
}
