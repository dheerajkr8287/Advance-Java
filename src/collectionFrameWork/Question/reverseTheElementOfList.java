package collectionFrameWork.Question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseTheElementOfList {
    public static void reverse(List<Integer> list){
        for (int i = 0; i < list.size()/2; i++) {
            swapofelement.swap(list,i,list.size()-1-i);
        }
    }
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
//        System.out.println(list);

        //using collections
//        Collections.reverse(list);
//        System.out.println(list);


        //without collections
        System.out.println(list);

        reverse(list);
        System.out.println(list);

    }
}
