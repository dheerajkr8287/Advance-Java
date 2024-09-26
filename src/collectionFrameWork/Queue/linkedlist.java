package collectionFrameWork.Queue;
/*
1:Deque--->designed for holding element in prior to processing
2:ordering elements in FIFO
3:offer two ends-one for insertion(tail) and other removal(head)

 */
import java.util.LinkedList;
import java.util.Queue;

public class linkedlist {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(11);//throw exception if the element cannot be added
        queue.offer(22);//return false if the element cannnot be added

        Utility.print(queue);
        System.out.println(queue.peek());//Returns:the head of this queue, or null if this queue is empty
        System.out.println(queue.element());//Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty.

        System.out.println(queue.remove());//Retrieves and removes the head of this queue. This method differs from poll() only in that it throws an exception if this queue is empty.
        System.out.println(queue.poll());//Retrieves and removes the head of this queue, or returns null if this queue is empty.


    }
}
