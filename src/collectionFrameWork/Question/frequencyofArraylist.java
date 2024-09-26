package collectionFrameWork.Question;

import java.util.*;

public class frequencyofArraylist {

    public static void main(String[] args) {

        //QUESTION METHOD -1
//        int arr[]={10,10,2,4,6,33,5,22,2,2,4,4};
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int val:arr){
//            if(map.containsKey(val)){
//                map.put(val,map.get(val)+1);
//            }
//            else{
//                map.put(val,1);
//            }
//        }
//        System.out.println(map);


        List<Integer> list= Arrays.asList(4,4,6,3,53,3,4,25,5,4,5,6);
        System.out.println(Collections.frequency(list,4));
        System.out.println(Collections.frequency(list,2));








    }
}
