package COLLECTIONS.List;

import java.util.LinkedList;
import java.util.Stack;

public class stackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        Integer peek = stack.peek();
        System.out.println(peek);
        Integer pop = stack.pop();
        System.out.println(pop);
        System.out.println(stack);
        System.out.println(stack.size() );
        System.out.println(stack.isEmpty());

        //search is i based indexing
        System.out.println("Search for 4 in stack:");
        int search = stack.search(5);
        System.out.println(search);


        //--> we can also perfrom linkedlist just like stack
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);

        System.out.println(linkedList.getLast());//peek
        System.out.println(linkedList.removeLast());//pop
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.isEmpty());


    }
}
