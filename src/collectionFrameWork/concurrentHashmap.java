package collectionFrameWork;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashmap {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,Integer> map=new ConcurrentHashMap<>();
        map.put(10,10);
        map.put(60,20);
        map.put(50,30);
        map.put(40,40);
        Iterator<Map.Entry<Integer,Integer>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            map.put(333,555);//if here i use without use of concurrent collection put value thread 2 is not alloewd in thread1
        }
    }
}
