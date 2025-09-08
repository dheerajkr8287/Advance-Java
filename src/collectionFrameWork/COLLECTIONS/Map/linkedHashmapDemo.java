package COLLECTIONS.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashmapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>(11,0.3f,true);//doubly linked list
        linkedHashMap.put("orange",10);
        linkedHashMap.put("apple",20);
        linkedHashMap.put("gauva",39);

        linkedHashMap.get("apple");
        linkedHashMap.get("orange");
        linkedHashMap.get("gauva");




        for (Map.Entry<String,Integer> entry:linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+":"+ entry.getValue());
        }

        HashMap<String,Integer> hashMap=new HashMap<>();
        LinkedHashMap linkedHashMap1=new LinkedHashMap(hashMap);

        hashMap.put("subha",23);
        hashMap.put("bob",89);
        hashMap.put("askit",44);


        hashMap.getOrDefault("vipul",0);
        hashMap.putIfAbsent("subha",83);
        System.out.println(hashMap);
    }
}
