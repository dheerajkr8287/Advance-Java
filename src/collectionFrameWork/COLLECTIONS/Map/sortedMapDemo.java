package COLLECTIONS.Map;



import java.util.Comparator;
import java.util.NavigableMap;
import java.util.SortedMap;

import java.util.TreeMap;

class mykey implements Comparable<mykey>{
    String key;

    public mykey(String key) {
        this.key = key;
    }


    @Override
    public int compareTo(mykey o) {
        //descending other
        return o.key.compareTo(this.key);
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj instanceof mykey o){
            return this.key.equals(o.key);

        }return false;
    }

    @Override
    public String toString() {
        return key;
    }
}

class DescendingKeyComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);    //decending order
    }
}
public class sortedMapDemo{
    public static void main(String[] args) {



//        SortedMap<Integer,String> map=new TreeMap<>(new DescendingKeyComparator());
        //this is lambda expression
//        SortedMap<String, Integer> map = new TreeMap<>((a, b) -> b.compareTo(a));


//        SortedMap<String, Integer> map = new TreeMap<>((a, b) -> b-a);

//        map.put(91,"vivwk");
//        map.put(99,"subham");
//        map.put(78,"raju");
//        map.put(33,"kaka");
//        System.out.println(map);

        SortedMap<mykey,Integer> map=new TreeMap<>();
        map.put(new mykey("kaka"),93);
        map.put(new mykey("alex"),28);
        map.put(new mykey("jira"),99);
        map.put(new mykey("kali"),39);
        map.put(new mykey("jiker"),38);
        System.out.println(map);





//        System.out.println(map.firstKey());
//        System.out.println(map.lastKey());
//        System.out.println(map.headMap(91));//exclueded
//        System.out.println(map.tailMap(91));


        NavigableMap<Integer,String> navigableMap=new TreeMap<>();

        navigableMap.put(1,"one");
        navigableMap.put(5,"five");
        navigableMap.put(3,"three");

        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerEntry(4));
        System.out.println(navigableMap.ceilingKey(1));
        System.out.println(navigableMap.descendingMap());
    }



}
