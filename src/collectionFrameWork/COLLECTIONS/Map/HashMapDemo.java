package COLLECTIONS.Map;

import java.util.HashMap;
import java.util.Map;

public class  HashMapDemo  {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"raka");
        map.put(2,"suraj");
        map.put(3,"raja");
//        map.put(null,"kaka");
//        map.put(null,null);

        System.out.println(map);

        System.out.println(map.containsKey(3)); 
        System.out.println(map.containsValue("dka"));

        for(int i:map.keySet()){
            System.out.println(map.get(i));
        }

        for (Map.Entry<Integer,String > i:map.entrySet()){
//            System.out.println(i.getKey()+":"+ i.getValue());
            i.setValue(i.getValue().toUpperCase());
        }

        System.out.println(map);
    }
}
