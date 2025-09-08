package COLLECTIONS.Map;

//An LRU (Least Recently Used) Cache is a data structure that stores a limited number of items and discards the least recently used item when the limit is exceeded. In Java, this can be easily implemented using the LinkedHashMap class, which maintains the insertion/access order of elements.
//LinkedHashMap with accessOrder=true keeps entries in the order they were last accessed.
//removeEldestEntry ensures the oldest (least recently used) item is removed when the capacity is exceeded.
import java.util.LinkedHashMap;
import java.util.Map;

public class LruCacheDemo<K,V> extends LinkedHashMap<K,V> {

    private int capacity;

    public LruCacheDemo(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;

    }

    public static void main(String[] args) {
//Java implementation of an LRU Cache using LinkedHashMap
        LruCacheDemo<String ,Integer> student=new LruCacheDemo<>(3);
        student.put("bob",99);
        student.put("alice",44);
        student.put("rak",90);
        student.get("bob");
        student.put("jj",33);
        System.out.println(student);
    }
}
