package COLLECTIONS.Map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable=new Hashtable<>();
        //hash table is synchronized
        //no null key or value
        //legacy class or concurrentHashMap
        //slower than hashmap
        //all method are syncronized including put, get, remove, containsKey, containsValue
        //Unordered: Does not maintain insertion or sorting order.
        //  only linked list in case of collision
//        hashtable.put(1,"apple");
//        hashtable.put(2,"banana");
//        hashtable.put(3,"cheery");
//        System.out.println(hashtable);
//        System.out.println("the value for key2:"+hashtable.get(2));
//        System.out.println(hashtable.containsKey(3));
//        hashtable.remove(1);
////        System.out.println(null,"value");//throw exception
////        System.out.println("value",null);//throw exception
//        System.out.println("after:"+hashtable);


        Hashtable<Integer,String>map=new Hashtable<>();
        Thread thread1=new Thread(()->{
            for (int i = 0; i <1000 ; i++) {
                map.put(i,"thread1");
            }
        });

        Thread thread2=new Thread(()->{
            for (int i = 1000; i <2000 ; i++) {
                map.put(i,"thread2");
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("final size of Hashmap:"+map.size());

    }
}
