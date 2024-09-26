package collectionFrameWork.CollectionsClasss;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
The Collections class in Java is a utility class provided by the Java Collections Framework.
 It consists of static methods that operate on or return collections.
 These methods are useful for tasks such as sorting, searching, reversing, and other collection
  manipulations. The Collections class provides algorithms that work on various types of
  collections, such as List, Set, and Map.
 */
public class TestCollections {
    public static void main(String[] args) {
        List<Integer> num=new LinkedList<>();
        num.add(22);
        num.add(122);
        num.add(32);
        num.add(88);
        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);

        Collections.reverse(num);
        System.out.println(num);

        int max=Collections.max(num);
        System.out.println(max);

        List<Integer> unmodifiable =Collections.unmodifiableList(num);
        System.out.println(unmodifiable);

    }
}
