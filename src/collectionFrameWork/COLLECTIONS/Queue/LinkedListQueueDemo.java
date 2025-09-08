package COLLECTIONS.Queue;

import java.util.Queue;
/*
Implements Deque — can work as queue or stack.

Ordering: FIFO.

Null: Allowed.

Duplicates: Allowed.

Thread-safe:  No.
 */
public class LinkedListQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new java.util.LinkedList<>();
        queue.add(1); // Enqueue
        queue.add(2);
        queue.add(3);
        System.out.println("Queue after adding elements: " + queue);
        Integer removedElement = queue.remove(); // Dequeue
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after removing an element: " + queue);
        Integer peekedElement = queue.peek(); // Peek
        System.out.println("Peeked element: " + peekedElement);
        System.out.println("Final Queue: " + queue);

//        System.out.println("Queue size: " + queue.size());
//        System.out.println(queue.remove());//throws NoSuchElementException if queue is empty
//        System.out.println(queue.poll()); // returns null if queue is empty
//        System.out.println(queue.peek()); // returns null if queue is empty
//        System.out.println(queue.element()); // throws NoSuchElementException if queue is empty
//        System.out.println("Is queue empty? " + queue.isEmpty());





    }
}
