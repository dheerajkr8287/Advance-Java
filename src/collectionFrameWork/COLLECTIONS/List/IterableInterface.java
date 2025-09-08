package COLLECTIONS.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterableInterface {
    public static void main(String[] args) {
/*
🔹 1. Iterable Interface:
Root interface of the Java Collection Framework (except Map).
Present in java.lang package.
Any class implementing Iterable can be traversed element by element.

public interface Iterable<T> {
    Iterator<T> iterator();                // core method
    default void forEach(Consumer<? super T> action);
    default Spliterator<T> spliterator();
}


Key points:

Provides support for enhanced for-each loop.

Every Collection (List, Set, Queue) implements Iterable.

Requires implementation of iterator().

         */

        /*
        Iterator Interface:

Found in java.util package.
Used to traverse elements one-by-one in a forward direction only.
Returned by iterator() method of Iterable.

public interface Iterator<E> {
    boolean hasNext();   // checks if more elements exist
    E next();            // returns next element
    void remove();       // removes current element (optional)
}

         */
        List<String> list = new ArrayList<>(List.of("A", "B", "C"));

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //A B C


        /*
        ListIterator Interface:

A sub-interface of Iterator.

Specially designed for List (like ArrayList, LinkedList).

Allows bidirectional traversal (forward & backward).

Allows modification (add, set, remove) while iterating.

public interface ListIterator<E> extends Iterator<E> {
    boolean hasNext();
    E next();
    boolean hasPrevious();  // backward check
    E previous();           // previous element
    int nextIndex();
    int previousIndex();
    void remove();
    void set(E e);          // replace current element
    void add(E e);          // add element
}

         */
        List<String> list1 = new ArrayList<>(List.of("A", "B", "C"));

        ListIterator<String> li = list1.listIterator();

        // Forward traversal
        System.out.println("Forward:");
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        // Backward traversal
        System.out.println("\nBackward:");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

/*
| Feature             | `Iterator` ✅     | `ListIterator` ✅                   |
| ------------------- | ---------------- | ---------------------------------- |
| Applicable to       | All `Collection` | Only `List`                        |
| Traversal Direction | Forward only     | Forward + Backward                 |
| Modification        | `remove()` only  | `add()`, `set()`, `remove()`       |
| Index Information   | ❌ Not available  | ✅ `nextIndex()`, `previousIndex()` |
| Returned By         | `iterator()`     | `listIterator()`                   |


Summary:

Iterable → root interface, gives iterator().

Iterator → forward-only traversal (all collections).

ListIterator → bidirectional traversal + modification (only lists).
 */

    }
}
