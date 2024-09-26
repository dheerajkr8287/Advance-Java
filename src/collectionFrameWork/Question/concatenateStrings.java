package collectionFrameWork.Question;

import java.net.Socket;

/*
-->write a method concatenate Strings that takes variable argumrnts of type and concatenate them into single strings

 */
public class concatenateStrings {
    public static  String concatenate(String...str){
        StringBuilder sb=new StringBuilder();
        for (String s : str) {
            sb.append(s).append(" ");

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(concatenate("KAKA ","JI"));
        System.out.println(concatenate("i am","dheeraj","kumar"));

    }
}
