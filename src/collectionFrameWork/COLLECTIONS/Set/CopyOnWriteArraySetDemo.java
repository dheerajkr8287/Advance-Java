package COLLECTIONS.Set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        /*
Part of java.util.concurrent package.

Thread-safe Set implementation.

Backed internally by a CopyOnWriteArrayList.

Ensures no duplicates (like any Set).

On every modification (add, remove), it creates a new copy of the underlying array.

Iteration is fail-safe — no ConcurrentModificationException.

Best for read-heavy and write-light scenarios.

| Feature                | Behavior                                    |
| ---------------------- | ------------------------------------------- |
| **Thread-safe**        | Yes                                         |
| **Duplicate allowed?** | ❌ No                                        |
| **Null allowed?**      | ✅ Yes (only one)                            |
| **Iteration order**    | Insertion order                             |
| **Performance**        | Fast reads, slow writes                     |
| **Use case**           | Concurrent apps where reads dominate writes |

When to Use CopyOnWriteArraySet
Many threads read from the set, but few threads write.

You want thread-safe iteration without locking.

You want to avoid ConcurrentModificationException during iteration.

When NOT to Use
Write-heavy scenarios (every write creates a new copy → memory + performance cost).

Very large sets with frequent modifications.
         */

        CopyOnWriteArraySet<Integer> copyOnWriteSet=new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 0; i <= 5; i++) {
            copyOnWriteSet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("initial CopyOnWriteArraySet: " + copyOnWriteSet);
        System.out.println("initial ConcurrentSkipListSet: " + concurrentSkipListSet);

        System.out.println("Iterating over CopyOnWriteArraySet:");
        for (Integer num : copyOnWriteSet) {
            System.out.println("reading from CopyOnWriteArraySet: " + num);
            //Attempting to modify during iteration
            copyOnWriteSet.add(6); // This will not throw ConcurrentModificationException

        }
        System.out.println(copyOnWriteSet);
        System.out.println("Iterating over concurrentSkipListSet:");
        for (Integer num : concurrentSkipListSet) {
            System.out.println("reading from concurrentSkipListSet: " + num);
            //Attempting to modify during iteration
            concurrentSkipListSet.add(6); // This will not throw ConcurrentModificationException

            //so concurrentSkipListSet is also called weakly consistent
            //it allows concurrent modifications during iteration
        }
    }
}
