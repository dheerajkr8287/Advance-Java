package collectionFrameWork.List;
// Linked list class impelementd Clonable,java.io.Serializable interface but do not random  access interface so in the linked list random accees is not possible by index

import java.util.LinkedList;
import java.util.List;

public class linkedlist {
    public static void main(String[] args) {
        List<Integer> lt=new LinkedList<>();
        lt.add(11);
        lt.add(22);
        lt.add(43);
        lt.add(54);
        System.out.println(lt);
    }
}
