package string;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        //wjp to combine two string
        String s1 = "Dheeraj";
//        String s2="kumar";
//        System.out.println(s1+s2);
//        System.out.println(s1.concat(s2));


        //wjp to reverse a string
//        String reverseStr="";
//        for(int i=s1.length()-1;i>=0;i--){
//            reverseStr+=s1.charAt(i);
//
//        }
//        System.out.println(reverseStr.toCharArray());


        //wjp to check given String is palindrome or not

/*
A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. It can also be a string like LOL, MADAM etc.
 */
//        String sp="NITIN";
//        String reverse="";
//        for(int i=sp.length()-1;i>=0;i--){
//            reverse+=sp.charAt(i);
//        }
//        System.out.println(reverse);
//
//        if(sp.equals(reverse)){
//            System.out.println("palindrome");
//        }
//        else{
//            System.out.println("not palindrome");
//        }


        //write a java program to remove all occurence of given char
//        String a = "Dheeraj";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the character for remove:");
//        char d = sc.next().charAt(0);
//
//        String b="";
//        for (int i = 0; i < a.length() ; i++) {
//            if (a.charAt(i) == d) {
//                continue;
//            }
//            b=b+a.charAt(i);
//
//        }
//        System.out.println(b);


        //wjp to count number of word in string

//        String input="my name is dheeraj kumar";
//        input=input.trim();
//        if(input.isEmpty()){
//            System.out.println("NUMBER OF WORDS IS: 0");
//            return;
//        }
//        /*
//        input.charAt(i) == ' ':
//
//This checks if the current character (input.charAt(i)) is a space. A space is considered the boundary between words in a typical sentence.
//input.charAt(i + 1) != ' ':
//
//This checks if the character immediately following the current one (input.charAt(i + 1)) is not a space.
//If this condition is true, it means that after a space, there is a non-space character, which implies that a new word has started.
//         */
//        int wordCount=1;
//        for(int i=0;i<input.length();i++){
//            if(input.charAt(i)== ' ' && input.charAt(i+1)!=' '){
//                wordCount++;
//            }
//        }
//        System.out.println("number of words:"+wordCount);



        //wjp to compare to string

//        String a1="dheeraj";
//        String a2="dheeraj";
//        System.out.println(a1.compareTo(a2));


        //wjp to check first string is present in the second string
//        String b1="dheeraj";
//        String b2="dheeraj is student ";
//
//        if(b2.contains(b1)){
//            System.out.println(" first string is present in the second string");
//
//        }
//        else{
//            System.out.println("not present");
//        }



        //wjp to find the char occurence given by user

        Scanner sc=new Scanner(System.in);
        String c1="kaka is singer of punjab";
        System.out.println("enter your charcter:");
        char c2=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<c1.length();i++){
            if(c1.charAt(i)==c2 ){
                count++;
            }
        }
        System.out.println(count);






    }
}
