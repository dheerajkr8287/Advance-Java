package collectionFrameWork.List;
/*
collection Interface :root interface of the collection hirerachy .it declare basic operation:likes add, remove ,clear and size
-->List Interface:an ordered collection .list can contain duplicate elements
-->Set interface:cannnot contain duplicate element and unordered collection
-->Queue interface:holding element in FIFO order
-->Map Interface:store key value pair


//generics are compile time in collection use after they remove it .
 */



import java.util.*;

class A implements Cloneable{
int a=10;
    @Override
    public A clone() {
        try {
            return (A) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
public class arraylist {
    //order
    //duplicate allowed
    //index
    //O(1)
    //intial capicity=10;
    //new capicity=(c*1.5)+1
    public static void main(String[] args) {
        //        A object=new A();
//        System.out.println(object.hashCode());
//        System.out.println(object.a);
//        A cloneObject=object.clone();
//
//        object.a=20;
//        System.out.println(object.a);
//        System.out.println();
//        System.out.println(cloneObject.hashCode());
//        System.out.println(cloneObject.a);



        //reference of super class hold obj of subclass
        List<Integer> list=new ArrayList<>();
        //add element
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.get(2));
        list.add(4,48);
        System.out.println(list);

        //set element
        list.set(2,444);
        System.out.println(list);

        //delete element
        list.remove(2);
        System.out.println(list);

        //add list
        List<Integer> list1=new ArrayList<>();
        list1.add(111);
        list1.add(222);
        list1.add(333);
        System.out.println(list.addAll(list1));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(44));
        System.out.println(list.isEmpty());

        //sorting a list
        Collections.sort(list);
        System.out.println(list);


        //by loop transverse
//        for(int i=0;i< list.size();i++){
//            System.out.print(list.get(i)+" ");
//        }

        //iterator

        Iterator<Integer> t1=list.iterator();
//        while (t1.hasNext()){//check the next element in the iteration.
//            System.out.print(t1.next()+" ");
//        }

        //for each
//        for(Integer value:list){
//            System.out.print(value+" ");
//        }

        //list print by listIterator

        ListIterator<Integer> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }
        System.out.println(" ");




    }
}
