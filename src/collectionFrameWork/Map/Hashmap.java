package collectionFrameWork.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(2,"dher");
        map.put(3,"kaka");
        map.put(4,"jajs");
        map.put(5,"dhsd");
        System.out.println(map);
        map.put(null,"null value");
        map.put(4,"kali");
        System.out.println(map);
        System.out.println(map.get(4));//kali
        System.out.println(map.containsKey(5));//true
        System.out.println(map.remove(2));
        System.out.println(map.size());


        Iterator<Map.Entry<Integer,String>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println(" -----------------");
        Iterator<Integer> In=map.keySet().iterator();
        while (In.hasNext()){
            Integer key=In.next();
            System.out.println("key="+key);
            System.out.println("value="+map.get(key));
        }

    }
}
