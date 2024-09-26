package collectionFrameWork.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//new capacity=cc*2
//it is thread safe
// It is synchronized, meaning it is thread-safe, and can handle multiple threads accessing it at the same time. However, this can make it slower compared to other non-synchronized classes like ArrayList
public class vector {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        System.out.println(vector.capacity());
        for (int i = 0; i < 10; i++) {
            vector.addElement(i);
        }
        System.out.println(vector.capacity());
        vector.addElement(22);
        System.out.println(vector.capacity());
        System.out.println(vector);

        // Accessing elements using get()
         System.out.println(vector.get(10));
        System.out.println(vector.elementAt(9));//Returns the component at the specified index.


        // Removing element at index 1
        vector.remove(1);
        System.out.println(vector);

        // Iterating through the Vector
//        Iterator<Integer> a=vector.iterator();
//        while (a.hasNext()) System.out.print(a.next() + " ");


        System.out.println(" ");


        System.out.println("Print by Enumeration:");
        Enumeration<Integer>  element=vector.elements();
        while (element.hasMoreElements()){
            Integer integer=element.nextElement();
            System.out.print(integer+" ");
        }

        System.out.println(" ");
        System.out.println(vector.capacity());


    }
}
