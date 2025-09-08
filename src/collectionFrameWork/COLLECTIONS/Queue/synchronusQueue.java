package COLLECTIONS.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/*
What is SynchronousQueue?

A special type of BlockingQueue in java.util.concurrent.

Capacity = 0 → it doesn’t store elements at all.

Each insert (put) must wait for a corresponding remove (take), and vice versa.

Works like a direct handoff between producer and consumer threads.

Think of it as a meeting point where producer hands over an item directly to consumer — no buffer, no storage.
each insert operation must wait for a corresponding remove operation by another thread, and vice versa.
No internal capacity, not even one element.
it cannnot store elements.,capcity of at most one element.


When to Use SynchronousQueue?

When you want no queueing, only direct transfer between producer and consumer.

For low-latency messaging (no overhead of storing).

In Executors where unbounded task queues are not desired.

 */
public class synchronusQueue {
    public static void main(String[] args) {
        BlockingQueue<String> queue=new SynchronousQueue<>();

        Thread producer=new Thread(()->{
            try {
                System.out.println("Producer is waiting to transfer...");
                queue.put("Hello from producer");
                System.out.println("Producer has  transferred the item.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer interrupted");
            }
        });


        Thread consumer=new Thread(()->{
            try {
                System.out.println("Consumer is waiting to take...");
                String message=queue.take();
                System.out.println("Consumer has taken the item: "+message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");
            }
        });


        producer.start();
        consumer.start();
    }
}
