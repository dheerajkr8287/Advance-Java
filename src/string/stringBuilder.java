package string;

public class stringBuilder {
    public static void main(String[] args) {
        /*

        1.StringBuilder:when we want mutable string without thread safety(multiple thread are allowed) then 'StringBuilder' will be used.
        2:StringBuffer:when we want a mutable string with thread safety then 'StringBuffer' will be used.
        3:String:when we want a immutable object the 'string' should be used. and String is thread safe
         */

        StringBuilder obj=new StringBuilder("welcome to ");
        obj.append("spark ");
        System.out.println(obj);



    }
}
