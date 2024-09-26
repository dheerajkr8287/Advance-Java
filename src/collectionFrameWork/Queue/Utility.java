package collectionFrameWork.Queue;

import java.util.Collection;
import java.util.Collections;

public class Utility {
    public static<E> void print(Collection<E> collection){
        System.out.print("collection is:");
        for (E i : collection) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
}
