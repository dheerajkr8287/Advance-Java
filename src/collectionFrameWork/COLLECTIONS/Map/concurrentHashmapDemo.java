package COLLECTIONS.Map;

import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashmapDemo {
    public static void main(String[] args) {
        //ConcurrentHashMap is a part of Java’s java.util.concurrent package.
        // It is a thread-safe, high-performance hash table designed for concurrent access from multiple threads without locking the entire map.

        //Unlike Hashtable, which locks the entire map for every read/write operation,
        // ConcurrentHashMap uses fine-grained locking,
        // allowing multiple threads to read and write simultaneously.

        //. No null Keys or Values
        //High Performance

        ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<>();
        // java  7 --> segment based locking --> 16 segments->smaller hashmaps
        // only the segment being written to or read from is locked
        //read :do not require locking unless there is write operation happening on the same segment
        //write : lock (put ,update)


        //java 8-->no segmentation(bucket-level locking)
         //        --> compare and swap approch =>no locking except resizing or collision
        //  Thread A last saw --> x=45;
        // Thread A work --> x to 50
        // if x is still 45 then change it to 50 else don't change and retry
        //put --> index


        //add value
        map.put("apple",40);
        map.put("Banana",20);

        //concurrent access
        Thread t1=new Thread(()->{
            map.put("orange",30);
        });

        Thread t2=new Thread(()->{
            map.compute("apple",(key,val)->val+10);
        });


        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        map.forEach((key, val) -> System.out.println(key + ": " + val));

    }
}
