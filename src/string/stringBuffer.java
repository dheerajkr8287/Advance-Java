package string;

public class stringBuffer {
    public static void main(String[] args) {

        /*
        1:stringBuffer class is mutable
        2:It is similiar to the string
        3:if we want to lot of modification that we can go with stringbuffer
        4:stringbuffer class is thread safe(not use in multithreading)



        */

        StringBuffer sb=new StringBuffer("dheeraj");
        sb.append("kumar");
        System.out.println(sb);



        //string and stringbuffer

        //string :object can change
        String s1="hello";
        String s2=s1.concat("world");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);

        //stringbuffer:same object after modifies

        StringBuffer s3=new StringBuffer("raj") ;
        s3.append("kumar");
        System.out.println(s3);




        
    }
}
