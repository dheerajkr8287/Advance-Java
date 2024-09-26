package collectionFrameWork.Set;
/*
set:
1:unique element
2:unoredered collection
3:no postion access
4:current capcity:16
5:fillratio,loadfactor:75%(12)(ke baad new capcaity make)
6:hashset underlying DS is hashtable


 */
import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(112);
        set.add(22);
        set.add(33);
        set.add(33);
        set.add(44);
        System.out.println(set);
        System.out.println(set.add(33));
        System.out.println(set.size());
        System.out.println(set.contains(22));
        System.out.println(set.remove(22));
        System.out.println(set);

    }
}
