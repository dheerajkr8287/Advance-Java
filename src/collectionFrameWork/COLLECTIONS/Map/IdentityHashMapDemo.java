package COLLECTIONS.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1=new String("key");
        String key2=new String("key");
//        in the hashmap its own hashcode() is used that compare the String hashcode and equal() method is used
//        so both have same hashcode and equal() method is used to compare the value
//        so the value is replaced in the hashmap

//        Map<String,Integer> map=new HashMap<>();
        Map<String,Integer> map=new IdentityHashMap<>();
        //yaha par hashcode() or equals() ho ya na ho yaha toh object class ka hashcode or equal chalega which play with memory address
        //because of new keyword both are different object
        //so both have different hashcode and value is not replaced
        //so in identityHashMap it use the object class identityHashcode() and == compare
        //it use the memoryAddress of object because of new keyword

        map.put(key1,1);
        map.put(key2,2);
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
        //because of same String key the hashcode is same so its value is replaced after one
        System.out.println(map);

        //but In identityHashMap it used the object class identityHashcode() and == compare() it use the memoryAddress of object because of new keyword
        //both have different hashcode
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        System.out.println(map);
    }
}
