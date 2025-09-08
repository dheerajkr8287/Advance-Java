package COLLECTIONS.List;

import java.util.Arrays;
import java.util.LinkedList;

public class Test{
    public static void main(String[] args) {
//        LinkListNode node1=new LinkListNode();
//        LinkListNode node2=new LinkListNode();
//
//        node1.value=1;
//        node1.next=node2;
//
//        node2.value=2;
//        node2.next=null;

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.get(2);//o(n)
        linkedList.addLast(4);//o(1)
        linkedList.addFirst(0);//o(1)
        linkedList.getFirst();
        linkedList.getLast();
        System.out.println(linkedList);
        linkedList.removeIf(x->x%2==0);
        System.out.println(linkedList);

        LinkedList<String> animal=new LinkedList<>(Arrays.asList("cat","dog","elephant"));
        LinkedList<String> animalToRemove=new LinkedList<>(Arrays.asList("dog","lion"));
        animal.removeAll(animalToRemove);
        System.out.println(animal);









    }

}

class LinkListNode {
    public int value;
    public  LinkListNode next;

}
