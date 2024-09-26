package string;

import java.util.Arrays;

public class method {
    public static void main(String[] args) {
        //length()
        String s="Dherrak";
        System.out.println(s.length());//7

        //concatination()
        String s1="Dheeraj";
        String s2="Kumar";
        String s3=s1+s2;
        System.out.println(s3);//DheerajKumar


        //toCharArray()
        String s4="Ashwani";
        char arr[]=s4.toCharArray();
        System.out.println(Arrays.toString(arr));//[A, s, h, w, a, n, i]


        //charAt():
        String s11="leela";
        System.out.println(s11.charAt(2));//e

        //compareTo()
        String s12="hello";
        String s13="hello";
        int res=s12.compareTo(s13);
        System.out.println(res);//0


        //equals()
        System.out.println(s12.equals(s13));//true

        //contains()
        String s15="dheeraj kumar is .";
        System.out.println(s15.contains("dheeraj"));//true

        //indexOf()
        System.out.println(s15.indexOf('e'));//2

        //repalce()
        String s18="dheeraj kumar is .";
        String rep=s18.replace(".","here");
        System.out.println(rep);//dheeraj kumar is here

          //subString()
        String s0="dheeraj kumar is here";
        String r2=s0.substring(0,7);
        System.out.println(r2);
        String r3=s0.substring(3);
        System.out.println(r3);









    }
}
