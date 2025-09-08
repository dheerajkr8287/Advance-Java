package COLLECTIONS.List;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnWriteArrayListDemo {


    public static void main(String[] args) {
         //copy on write means that whenever a write operation
        //like adding or removing an elements
        //instead of directly modifying the existing list
        //a new copy of the list is created,and the modification is applied to the copy
        //this ensures that other threads reading the list while its being modified are unaffected

        //read operations:fast and direct they happen on a stable list without interference from modifications
        //write operation: anew copy of the list is created for every modification

        //the reference to the list is then updated so that subsequents read use this new list


//        List<String> shoppingLis=new CopyOnWriteArrayList<>();
//        shoppingLis.add("milk");
//        shoppingLis.add("eggs");
//        shoppingLis.add("bread");
//        System.out.println("initial shopping list:"+shoppingLis);
//
//        for(String i:shoppingLis){
//            System.out.println(i);
//            // try to modify the list while reading
//
//            if(i.equals("eggs")){
//                shoppingLis.add("butter");
//                System.out.println("added butter while");
//            }
//
//        }
//
//        //purani=new  list ho jayega yaha
//        System.out.println("updated shopping list:"+shoppingLis);


        List<String> sharedList=new CopyOnWriteArrayList<>();
        sharedList.add("item1");
        sharedList.add("item2");
        sharedList.add("item3");

        ReaderThread readerThread=new ReaderThread(sharedList);
        WriterThread writerThread=new WriterThread(sharedList);

        readerThread.start();
        writerThread.start();

//
//
//        Thread readerThread=new Thread(()->{
//            try {
//                while (true){
//                    //iterate through the list
//                    for(String item:sharedList){
//                        System.out.println("Reading item:"+item);
//                        Thread.sleep(100);
//                    }
//
//
//                }
//            }
//            catch (Exception e){
//                System.out.println("Exception in reader"+e);
//            }
//
//        });
//
//        Thread writerThread =new Thread(()->{
//            try{
//                Thread.sleep(500);
//                sharedList.add("item4");
//                System.out.println("added item4 to the list");
//
//                Thread.sleep(500);
//                sharedList.remove("item1");
//                System.out.println("removed item1 from the list");
//            }catch (Exception e){
//                System.out.println("Exception in writer"+e);
//            }
//        });
//
//        readerThread.start();
//        writerThread.start();







    }

    //read thread

    static class ReaderThread extends  Thread{
        private   final  List<String>list;

        public ReaderThread(List<String> list) {
            this.list = list;
        }

        @Override
        public void run() {

            try{
                while (true){
                    for (String item:list){
                        System.out.println("reading item:"+item);
                        Thread.sleep(1000);
                    }
                }
            }catch(Exception e){
                System.out.println(e);

            }
        }
    }

    static  class WriterThread extends Thread{
        private final List<String> list;

        public WriterThread(List<String> list) {
            this.list = list;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(500);
                list.add("item4");
                System.out.println("added item4 to the list");

                Thread.sleep(500);
                list.remove("item1");
                System.out.println("removed items from the list");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
