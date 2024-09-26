package collectionFrameWork.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("India","delhi");
        map.put("pakistan","lahore");
        map.put("uk","london");
        map.put("japan","tokoyo");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the country name:");

        String countryKey=sc.next();


            if (map.containsKey(countryKey)) {
                System.out.println(countryKey+":"+map.get(countryKey));

            }
            else {
                System.out.println("we don't know the captital");
            }

        
    }
}
