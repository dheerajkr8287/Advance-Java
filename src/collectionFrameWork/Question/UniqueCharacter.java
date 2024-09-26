package collectionFrameWork.Question;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {
    public static void main(String[] args) {
        Set<Character> unique=new HashSet<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your String:");
        String userStr=input.next();

        for (char ch : userStr.toCharArray()) {
            unique.add(ch);
        }

        System.out.println("your String has "+unique.size()+"character.");

    }
}
