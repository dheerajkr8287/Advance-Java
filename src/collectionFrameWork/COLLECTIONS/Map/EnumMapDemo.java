package COLLECTIONS.Map;

import java.util.EnumMap;
import java.util.Map;

/*
EnumMap in Java is a specialized Map implementation designed specifically for enum keys.
It’s part of the java.util package and provides an efficient, ordered, and type-safe way to store mappings where keys are enums.

1. Key Points
Keys must be of a single enum type (cannot mix different enums).

Internally implemented as an array, making it faster than HashMap when using enums.

Maintains keys in their natural enum order (the order in which constants are declared).

Null keys are not allowed, but null values are allowed.

Not thread-safe (must be synchronized externally for concurrent use).

4. Why use EnumMap over HashMap?
Feature	HashMap	EnumMap
Key type	Any object	Only Enums
Internal Storage	Hash table	Array (indexed by ordinal)
Performance	Good	Faster (O(1) with array lookup)
Ordering	No	Maintains enum’s natural order
Null Keys	Allowed	Not allowed

5. When to Use
When your keys are enum constants.

When you want fast lookups and ordered keys.

Example use cases: schedules, configuration by enum, state machine mappings.
 */
enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumMapDemo {

    public static void main(String[] args) {


        EnumMap<Day, String> enumMap = new EnumMap<>(Day.class);
        // Adding elements
        enumMap.put(Day.MONDAY, "Start of the week");
        enumMap.put(Day.TUESDAY, "Second day of the week");
        enumMap.put(Day.WEDNESDAY, "Midweek");
        enumMap.put(Day.THURSDAY, "Almost weekend");
        enumMap.put(Day.FRIDAY, "End of the work week");
        enumMap.put(Day.SATURDAY, "Weekend");
        enumMap.put(Day.SUNDAY, "Rest day");
        // Accessing elements
        for (Map.Entry<Day, String> entry : enumMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Value for TUESDAY: " + enumMap.get(Day.TUESDAY));


    }
}
