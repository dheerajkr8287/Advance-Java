package COLLECTIONS.Queue;

import java.util.Comparator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/*
Definition

BlockingQueue is an interface in java.util.concurrent package.
It extends Queue and adds thread-safety + blocking behavior.

👉 Specially designed for producer-consumer problems.
it simplify concurrency problems like producer-consumer.

standard queue --immediately returns if operation cannot be performed.
empty --> remove (no waiting)
full --> add (no waiting)

//blocking queue
put=> blocks if the queue is full until space is available.
take=> blocks if the queue is empty until an element is available.
offer->waits for space to become available within a given time limit.


Producer → puts data in queue.

Consumer → takes data out of queue.

If queue is full → producer thr ead blocks (waits) until space is available.

If queue is empty → consumer thread blocks (waits) until an element is available.

Method	Behavior:
put(E e)	Inserts element, waits if queue is full
take()	Retrieves & removes element, waits if queue is empty
offer(E e)	Inserts element, returns false if full (no wait)
offer(E e, long timeout, TimeUnit unit)	Waits for space, else times out
poll()	Retrieves element, returns null if empty
poll(long timeout, TimeUnit unit)	Waits for element, else times out
peek()	Just looks at head, returns null if empty
 */

class Producer implements Runnable{
    private BlockingQueue<Integer> queue;
    private int  value=0;
    public Producer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }
    @Override
    public void run() {
          while (true){
                try {
                    System.out.println("Producing "+value);
                    queue.put(value++);
                    Thread.sleep(1000);
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Producer interrupted");

                }
          }
    }
}

class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;
    public Consumer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }
    @Override
    public void run() {
        while (true){
            try {
                Integer value=queue.take();
                System.out.println("Consumer consumed "+value);
                Thread.sleep(2000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");

            }
        }
    }
}
public class BlockingQueueDemo {
    public static void main(String[] args) {

        /*
        What is ArrayBlockingQueue?

A bounded blocking queue backed by an array.
Once created, its capacity (size) is fixed and cannot grow.
Belongs to java.util.concurrent package.
Thread-safe → multiple producers and consumers can safely use it without explicit synchronization.
Uses FIFO (First-In-First-Out) ordering → elements are taken out in the same order they were put in.

Key Points:

1:Fixed Capacity
BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
→ Queue can store max 5 elements.
2:Blocking Behavior
put() → waits if queue is full.
take() → waits if queue is empty.
3:Thread-Safety
Internally uses a ReentrantLock and two Condition objects:
notEmpty → signals consumers when items are available.
notFull → signals producers when space is available.
4:Fairness Option
ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<>(10, true);
If fairness = true → threads are served in FIFO order.
Default = false → performance is better, but no strict fairness.


When to Use ArrayBlockingQueue=============>>>>>

You know the maximum number of elements in advance.

You need a bounded buffer in a producer-consumer scenario.

You want thread-safe queueing without writing synchronization code.

Example use cases:

Thread pools

Task scheduling

Message passing between threads

         */

        BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(5);
// a bounded ,blocking queue backed by an circular array
// low memeory overhead
// usage a single lock both enqueue and  dequeueoperations
// more thread ===> problem due to  too much waiting   so use  LinkedBlockingQueue
        Thread producerThread=new Thread(new Producer(queue));
        Thread consumerThread=new Thread(new Consumer(queue));
        producerThread.start();
        consumerThread.start();

        BlockingQueue<Integer> queue1=new LinkedBlockingQueue<>();
        // an unbounded blocking queue backed by linked nodes max size =Integer.MAX_VALUE
        //optionallly bounded backed by linked list
//        higher concurrency b/w producers and consumers
//        separate locks for enqueue and dequeue operations



        BlockingQueue<String > queue2=new PriorityBlockingQueue<>(11, Comparator.reverseOrder()) ;
        // an unbounded blocking queue backed by a priority heap

        //BINARY HEAP as array and grow dynamically
        //head is based on their natural orderiing or provided comparator like priority queue
        //put wont block as unbounded
        //take will block if empty

        /*
        An unbounded blocking queue that uses priority ordering instead of FIFO.
Belongs to java.util.concurrent.
Internally backed by a PriorityQueue (min-heap).
Thread-safe — multiple threads can add/remove safely.
Unlike ArrayBlockingQueue, it doesn’t have a fixed capacity (grows as needed).

Key Characteristics

Ordering:
Elements are ordered according to their natural ordering (Comparable) or a custom Comparator.
Example:
Integers → smallest comes out first.
Strings → lexicographical order.
You can pass a comparator in the constructor.

Unbounded:
Technically, it grows as much as memory allows.
That means put() never blocks due to "full queue".
Blocking Nature:
take() → waits if queue is empty.
put() → never blocks (because unbounded).
Thread-safety:
Internally uses ReentrantLock for concurrency.
Not strictly FIFO:
Order depends on priority, not insertion time.

When to Use PriorityBlockingQueue:

When tasks must be executed by priority, not FIFO.

Task schedulers, job execution systems, message handling with priorities.

Good for producer-consumer where important tasks must be executed first.
         */
        queue2.add("Apple");
        queue2.add("Orange");
        queue2.add("Banana");
        queue2.add("Grapes");
        System.out.println("PriorityBlockingQueue: "+queue2);









    }
}
