package COLLECTIONS.Queue;

import java.util.concurrent.ConcurrentLinkedQueue;

/*
What is ConcurrentLinkedQueue?

Part of java.util.concurrent package.

An unbounded, thread-safe, non-blocking queue based on a linked node structure.

Implements Queue interface and uses Compare-And-Swap (CAS) for concurrency instead of locks.

👉 It’s widely used when multiple threads need to add/remove elements concurrently without blocking each other.

🔹 Key Features

Unbounded → grows dynamically (limited only by memory).

Thread-Safe → supports concurrent access using lock-free CAS algorithm.

FIFO Ordering → maintains order of insertion (first-in-first-out).

Non-Blocking → unlike BlockingQueue, it does not block producers or consumers.

If empty → poll() returns null (instead of blocking).

If full → never blocks, since it’s unbounded.

Performance → higher throughput in multi-threaded scenarios than lock-based queues like LinkedBlockingQueue
 Important Methods
Method	Description
add(E e)	Inserts element at the tail (throws exception if null).
offer(E e)	Inserts element at the tail (returns true).
peek()	Returns head element without removing, or null if empty.
poll()	Retrieves and removes head element, or null if empty.
isEmpty()	Checks if queue is empty.
size()	Returns number of elements (⚠️ not constant-time, as it traverses list).
 */
public class ConcurrentLinkedQueueDemo {
    private static ConcurrentLinkedQueue<String> taskQueue = new ConcurrentLinkedQueue<>();
    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            while (true) {
                try {
                    boolean add = taskQueue.add("Task at " + System.currentTimeMillis());
                    if (add) {
                        System.out.println ("Added a new task.");
                    }
                    Thread.sleep(1000); // delay 1 second
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    String task = taskQueue.poll();
                    if (task != null) {
                        System.out.println("Processing " + task);
                        Thread.sleep(500); // simulate work
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();

    }
}


/*
When to Use ConcurrentLinkedQueue?

✅ Use when:

You need non-blocking operations.

Many threads are adding/removing frequently.

Throughput is more important than strict blocking semantics.

❌ Avoid if:

You need blocking behavior (then use LinkedBlockingQueue or ArrayBlockingQueue).

You require bounded queue with capacity limits.

🔹 Internal Working (Simplified)

Uses a linked node structure.

Maintains head and tail references.

Operations (offer, poll) use CAS (Compare-And-Swap) to safely update pointers without locks.

This makes it faster in concurrent environments but size() becomes O(n) since traversal is needed.
 */
