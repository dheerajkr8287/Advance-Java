package COLLECTIONS.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/*
👉 It is an interface in java.util package, introduced in Java 1.6.
👉 Stands for Double-Ended Queue, meaning you can insert and remove elements from both ends (front and rear).
Important Points:

It supports both FIFO (queue) and LIFO (stack) operations.
Can be bounded (fixed size) or unbounded.
Allows null elements in some implementations (like LinkedList) but not in others (like ArrayDeque).
Provides more versatile methods than Queue.


Common Implementations:

ArrayDeque (most used, fast, resizable array-based, no capacity restrictions, not thread-safe)
LinkedList (node-based, supports null, slower than ArrayDeque)
ConcurrentLinkedDeque (thread-safe, lock-free, for concurrency)
LinkedBlockingDeque (bounded, thread-safe, used in producer-consumer scenarios)

Method	Description:
addFirst(e)	Inserts at the front
addLast(e)	Inserts at the rear
offerFirst(e)	Inserts at front (returns false if fails)
offerLast(e)	Inserts at rear
removeFirst()	Removes element from front (throws exception if empty)
removeLast()	Removes element from rear
pollFirst()	Removes element from front (returns null if empty)
pollLast()	Removes element from rear
getFirst()	Retrieves front element (throws exception if empty)
getLast()	Retrieves rear element
peekFirst()	Retrieves front element (returns null if empty)
peekLast()	Retrieves rear element

 */
public class dequeue {
    public static void main(String[] args) {

        /*
        ArrayDeque:
ArrayDeque is a resizable array-based implementation of the Deque interface.
Internally it uses a circular buffer (array) to store elements.
No capacity limit (resizes automatically like ArrayList).
Does not allow null values.
Faster than LinkedList for queue/deque because array is cache-friendly.

Internal Working

It maintains an array internally.
Uses head and tail pointers.
When array is full → creates a new double-sized array and copies elements.
         */
        Deque<Integer> deque=new ArrayDeque<>();// faster than linkedlist,low memory,no null elements allowed,
        deque.addFirst(10);
        deque.addLast(20);
        deque.offerFirst(5);
        deque.offerLast(25);
        System.out.println("Deque: "+deque);

        System.out.println("first element: "+deque.getFirst());//5
        System.out.println("last element: "+deque.getLast());//25
        System.out.println("removed first element: "+deque.removeFirst());//5
        System.out.println("removed last element: "+deque.pollLast());//25


        for (int num:deque){
            System.out.println(num);
        }

        /*
        LinkedList implements both List and Deque.
It is a doubly linked list where each node has:
data
next (pointer to next node)
prev (pointer to previous node)

Internal Working:

Maintains head and tail references.
Insertion/removal at head or tail = O(1).
Searching or accessing by index = O(n) (traversal required).

Pros

Can store null values.
Efficient for insertions/deletions at both ends and middle.
Supports both List and Deque features.

❌ Cons

Higher memory usage (extra node objects).
Slower traversal due to pointer chasing.
Not cache-friendly.

         */
        Deque<Integer> deque1=new LinkedList<>();//insertion and deletion is faster than arraydeque,more memory,no capacity restrictions,null elements allowed



    }
}
