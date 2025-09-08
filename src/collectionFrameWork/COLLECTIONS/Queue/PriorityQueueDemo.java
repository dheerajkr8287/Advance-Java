package COLLECTIONS.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
Definition:
A queue that orders elements according to priority, not strictly FIFO.

Default Priority: Natural ordering (for numbers → ascending, for strings → alphabetical).

Custom Priority: You can provide a Comparator in the constructor.

Null Elements:  Not allowed.

Duplicates:  Allowed.

Thread Safety:  Not thread-safe (use PriorityBlockingQueue for concurrent scenarios).

Key Features
Internal Structure: Uses a binary heap stored in an array.

Ordering: Head of queue = least element (min-heap) by default.

Time Complexity:

offer() / add() → O(log n)

poll() / remove() → O(log n)

peek() → O(1)

Iterator: Not ordered; it’s a heap view, not sorted

 --------Internal Working----
Binary Heap:

Elements are arranged so that parent is always less than (min-heap) or greater than (max-heap) children.

Stored in an array internally.

Insertion:

New element placed at end.

"Heapify-up" (bubble-up) to restore order.

Removal:

Remove root.

Replace root with last element.

"Heapify-down" (bubble-down) to restore order.



Use Cases
✅ Scheduling tasks by priority (like CPU scheduling).
✅ Implementing Dijkstra's algorithm (shortest path).
✅ A* search in AI pathfinding.
✅ Job processing systems.


 */
public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        // Adding elements to the priority queue
        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);
        // Internally Default Min-Heap running
        //here we can see that at the first position the minimum element is present not about the sorting order
        while (!priorityQueue.isEmpty()) {
            // Polling elements from the priority queue
            System.out.println("Polled element: " + priorityQueue.poll());//10 20 30

        }

        // Adding elements with custom priority
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // 30, 20, 10
        }

    }
}

/*
Common Interview Questions
Why is PriorityQueue not thread-safe?
→ It’s designed for single-threaded priority ordering; use PriorityBlockingQueue for thread safety.

Can we iterate in sorted order?
→ No, iterator doesn’t guarantee sorted order; to iterate in order, remove elements using poll().

Null elements allowed?
→ No, NullPointerException if you try.

Difference between PriorityQueue and TreeSet?

PQ allows duplicates, TreeSet doesn’t.

PQ has O(log n) insertion/removal but offers direct access to highest/lowest priority item.

TreeSet maintains sorted iteration order, PQ doesn't.
 */