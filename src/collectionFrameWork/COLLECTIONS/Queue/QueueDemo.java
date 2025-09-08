package COLLECTIONS.Queue;
/*
In Java, a Queue is an interface in java.util package designed for First-In-First-Out (FIFO) data handling.
The element inserted first is removed first — like a line at a ticket counter
element are added at the end and removed from the front.

Key points:

Extends Collection<E>.

Ordering: Elements are processed based on insertion order or priority.

Can be bounded (fixed size) or unbounded.

May be thread-safe or non-thread-safe depending on implementation.

Methods come in two flavors:

Exception-throwing (add(), remove(), element())

Safe (offer(), poll(), peek())

Queue Interface Methods:

| Method          | Throws Exception | Returns Special Value |
| -------          | ---------------- | --------------------- |
| Insert(enqueue)  | `add(e)`   at end       | `offer(e)`            |
| Remove(dequeue)  | `remove()` at head      | `poll()`              |
| Examine(peek)    | `element()` head        | `peek()`              |



 */


import java.util.LinkedHashMap;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {

        //linked as queue
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(1);//adding first element-->ENQUEUE
        queue.addLast(2);
        queue.addLast(3);
        queue.addLast(4);
        System.out.println("Queue after adding elements: " + queue);
        //removing first element
        Integer removedElement = queue.removeFirst();//DEQUEUE
        System.out.println(queue);
        queue.getFirst();//peek first element

    }
}
