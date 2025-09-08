package COLLECTIONS.Set;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

/*
     Set is an interface in java.util that: In Java, a Set is a Collection that stores unique elements — meaning it does not allow duplicates.

Extends Collection<E>.

Disallows duplicates.

May or may not allow null.

Is implemented in multiple ways depending on ordering and performance needs.

Key Implementations of Set-->

| **Implementation**  | **Ordering**                      | **Duplicates** | **Performance**                      |
| ------------------- | --------------------------------- | -------------- | ------------------------------------ |
| **`HashSet`**       | No order maintained               | Not allowed    | O(1) average for add, remove, search |
| **`LinkedHashSet`** | Maintains insertion order         | Not allowed    | Slightly slower than `HashSet`       |
| **`TreeSet`**       | Sorted order (natural/comparator) | Not allowed    | O(log n) for add, remove, search     |

When to Use
HashSet → When you just need uniqueness and don’t care about order.

LinkedHashSet → When you need uniqueness and insertion order.

TreeSet → When you need uniqueness and sorted order.


       */

public class setDemo {
    enum Day { MON, TUE, WED, THU, FRI, SAT, SUN }
    public static void main(String[] args) {

/*
HashSet
Package: java.util

Backed by: HashMap

Order: No guaranteed order.

Null: Allows one null.

Performance: O(1) average for add/remove/contains.

Use Case: When you just need uniqueness and don’t care about order.
 */
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Banana"); // duplicate ignored
        hashSet.add(null); // allows one null
        System.out.println("HashSet: " + hashSet);

/*
LinkedHashSet
Package: java.util

Backed by: LinkedHashMap

Order: Maintains insertion order.

Null: Allows one null.

Performance: Slightly slower than HashSet but predictable iteration.

Use Case: When you need uniqueness + insertion order.
 */
        Set<String> linkedHashSet = new HashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana"); // duplicate ignored
        linkedHashSet.add(null); // allows one null
        System.out.println("LinkedHashSet: " + linkedHashSet);


        /*
         TreeSet
Package: java.util

Implements: NavigableSet → SortedSet

Order: Sorted according to natural order or a custom Comparator.

Null:  No null allowed (throws NullPointerException).

Performance: O(log n) for add/remove/contains.

Use Case: When you need uniqueness + sorted order.
         */
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        // treeSet.add(null); // NullPointerException
        System.out.println("TreeSet: " + treeSet);


/*
. EnumSet
Package: java.util

Only for: Enum types.

Order: Maintains natural order of enum constants.

Null:  No null allowed.

Performance: Very fast (uses bit vectors internally).

Use Case: When you want a Set for enums.
EnumSet → abstract class

Constructor → protected

Instantiation → only via static factory methods (noneOf, allOf, of, range, copyOf)
 */

        // 1. Creating an EnumSet with specific values
        EnumSet<Day> weekend = EnumSet.of(Day.SAT, Day.SUN);
        System.out.println("Weekend: " + weekend);
        // 2. Creating an EnumSet with all enum constants
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println("All Days: " + allDays);
        // 3. Creating an empty EnumSet and adding elements
        EnumSet<Day> workDays = EnumSet.noneOf(Day.class);
        workDays.add(Day.MON);
        workDays.add(Day.TUE);
        workDays.add(Day.WED);
        workDays.add(Day.THU);
        workDays.add(Day.FRI);
        System.out.println("Work Days: " + workDays);
        // 4. Getting a range of enums
        EnumSet<Day> midWeek = EnumSet.range(Day.TUE, Day.THU);
        System.out.println("Midweek: " + midWeek);
        // 5. Complement (opposite) of a set
        EnumSet<Day> notWeekend = EnumSet.complementOf(weekend);
        System.out.println("Not Weekend: " + notWeekend);

        //FOR THREAD SAFETY
//        Set<String> strings = Collections.synchronizedSet(hashSet); // Wraps the HashSet in a synchronized block (thread-safe) set

        /*
        ConcurrentSkipListSet (Concurrent Sorted Set)
Package: java.util.concurrent

Implements: NavigableSet

Order: Sorted order.

Null: No null allowed.

Thread-Safe: Yes.

Performance: O(log n) operations with high concurrency.

Use Case: Thread-safe sorted sets.
         */
        Set<String> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        concurrentSkipListSet.add("Banana");
        concurrentSkipListSet.add("Apple");
        concurrentSkipListSet.add("Orange");
        // concurrentSkipListSet.add(null); //  NullPointerException
        System.out.println("ConcurrentSkipListSet: " + concurrentSkipListSet);


        // immutable (unmodifiable) sets
/*
Set.of() (Java 9+)
Introduced in Java 9.

Creates an immutable set directly.

No duplicates allowed → if you pass duplicates, it throws IllegalArgumentException.

Null values not allowed → if you pass null, it throws NullPointerException.

Compact and concise for fixed values.
 */ Set<String> fruits = Set.of("Apple", "Banana", "Orange");
        System.out.println(fruits);

        // fruits.add("Mango"); // UnsupportedOperationException
        // Set<String> dup = Set.of("A", "B", "A"); // IllegalArgumentException
        // Set<String> nullSet = Set.of("A", null); //  NullPointerException
/*
Collections.unmodifiableSet()
Available since Java 1.2.

Wraps an existing set to make it read-only.

The original set can still be modified, and changes will be reflected in the unmodifiable view.

Allows null if the original set contains it.

Duplicates are already handled by the original set rules.
 */

        Set<String> originalSet = new HashSet<>();
        originalSet.add("Apple");
        originalSet.add("Banana");
        originalSet.add(null); // Allowed here

        Set<String> unmodifiableSet = Collections.unmodifiableSet(originalSet);
        System.out.println("Unmodifiable Set: " + unmodifiableSet);

        // unmodifiableSet.add("Orange"); // UnsupportedOperationException

        // BUT, modifying originalSet will reflect in unmodifiableSet
        originalSet.add("Orange");
        System.out.println("After modifying original: " + unmodifiableSet);






    }
}
