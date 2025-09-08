package COLLECTIONS.Map;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class concurrentSkipListMap {
    public static void main(String[] args) {

        // ConcurrentSkipListMap is a thread-safe variant of SkipListMap
        // It allows concurrent access and modifications by multiple threads
        // It is not part of the standard Java Collections Framework, but can be found in the java.util.concurrent package
        /*
        ConcurrentSkipListMap is a concurrent, scalable, and sorted implementation of the NavigableMap interface in Java’s Collection Framework.
It’s part of the java.util.concurrent package, introduced in Java 6.

1. Basic Idea
Think of ConcurrentSkipListMap as:

A thread-safe alternative to TreeMap

A sorted map that maintains ascending key order

Internally based on a Skip List data structure instead of a balanced binary tree

 Internal Working
Uses a Skip List:
Imagine a linked list with extra “express lanes” to jump ahead quickly → reduces search time to O(log n).

Updates (insert/delete) are done with fine-grained locking (or CAS operations), allowing high concurrency.
         */


        ConcurrentSkipListMap<Integer,String> map=new ConcurrentSkipListMap<>();
        // Adding elements
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Navigation
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Higher Key than 2: " + map.higherKey(2));

    }
}
