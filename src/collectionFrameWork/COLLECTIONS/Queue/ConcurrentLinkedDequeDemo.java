package COLLECTIONS.Queue;

import java.util.concurrent.ConcurrentLinkedDeque;

/*
What is ConcurrentLinkedDeque?

ConcurrentLinkedDeque is a thread-safe, non-blocking, and unbounded implementation of a double-ended queue (deque).

It is part of java.util.concurrent package.

It is based on a lock-free linked node algorithm (similar to ConcurrentLinkedQueue but supports both ends).

Key Points:

Deque (Double-Ended Queue) → You can insert/remove from both head and tail.

addFirst(), offerFirst(), pollFirst(), peekFirst()

addLast(), offerLast(), pollLast(), peekLast()

Thread-Safe → Multiple threads can safely access it without locks.

Unbounded → No fixed size (unlike ArrayBlockingQueue).

Use Case → Perfect for work-stealing algorithms, task scheduling, and situations where producers/consumers may work from both ends


Methods You Should Know

Insertion

addFirst(E e), offerFirst(E e) → add at head.

addLast(E e), offerLast(E e) → add at tail.

Removal

pollFirst() → removes head (returns null if empty).

pollLast() → removes tail (returns null if empty).

Peek

peekFirst() → looks at head without removing.

peekLast() → looks at tail without removing.

 */
public class ConcurrentLinkedDequeDemo {
    private static ConcurrentLinkedDeque<String> taskDeque = new ConcurrentLinkedDeque<>();
    public static void main(String[] args) {
        // Producer Thread
        Thread producer = new Thread(() -> {
            int i = 1;
            while (i <= 5) { // produce 5 tasks
                String task = "Task-" + i;
                taskDeque.addLast(task); // add to tail
                System.out.println("Produced: " + task);
                i++;
                try {
                    Thread.sleep(500); // simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            while (true) {
                String task = taskDeque.pollFirst(); // remove from head
                if (task != null) {
                    System.out.println("Consumed: " + task);
                }
                try {
                    Thread.sleep(700); // simulate processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();


    }
}
