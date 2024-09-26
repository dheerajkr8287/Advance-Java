package string;

public class stringBufferMethod {
    public static void main(String[] args) {
        //append
        StringBuffer s=new StringBuffer("kaka");
        s.append("ji");
        System.out.println(s);

        //insert
        s.insert(2,123);
        System.out.println(s);

        //reverse
        s.reverse();
        System.out.println(s);

        //replace
        s.replace(3,6,"hello");
        System.out.println(s);

        //capacity
        System.out.println(s.capacity());
    }
}
