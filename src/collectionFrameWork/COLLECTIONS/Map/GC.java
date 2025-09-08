package COLLECTIONS.Map;

import java.lang.ref.WeakReference;
import java.util.Collections;

public class GC {
    public static void main(String[] args) {

        //phone is strong reference : hmee yaha par reference(phone)==null  khud se dena parta then object is eligible for GC
//        Phone phone=new Phone("apple","17");
//        System.out.println(phone);
//
//        phone=null;
//        System.out.println(phone);


        //weakRefernce mai hmme phoneWeakReference=null
        // nhi dena parta hai yaha GC apne app understand kar leta hai
        // hai ki GC obj ko clean kare ya nhi

        WeakReference<Phone> phoneWeakReference=new WeakReference<>(new Phone("apple","20pro max"));
        System.out.println(phoneWeakReference.get());
        System.gc();
        try{
            Thread.sleep(10000);
        }catch (Exception e){

        }
        System.out.println(phoneWeakReference.get());

    }
}

class Phone{
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
