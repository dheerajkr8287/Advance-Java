package collectionFrameWork.Question;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
write a program that sort a list of String object in descending order using custom comparator
 */
public class sortAListOfString {
    public static void sortInDescending(List<String> list){
//        Collections.sort(list);
//        Collections.reverse(list);

        //by using custom comparator

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if(s.equals(t1)){
                    return 0;
                } else if (s.charAt(0)<t1.charAt(0)) {
                    return 1;


                }
                else {
                    return -1;
                }
            }
        });


    }
    public static void main(String[] args) {
       List<String> list= Arrays.asList("kaka","belu","raja","soja");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);
    }
}
