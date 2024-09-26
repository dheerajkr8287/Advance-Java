package string;
/*
1.String object are immutable in nature
2.HOW TO CREATE STRING OBJECT
   -->BY string literal
   -->by new keyword
   --->by converting character array into string
 */
public class syntax {
    public static void main(String[] args) {




//        By string literal
        /*String s1="dheeraj";
        System.out.println(s1);
        String s2="kumar";
        System.out.println(s2);
        String s3="dheeraj";
        System.out.println(s3);
        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//true*/


        //  by new keyword
//        two object create
        String s4="hello";
        String s5=new String("hello");



//   --->by converting character array into string

        char arr[]={'k','a','k','a'};
        String s=new String(arr);
        System.out.println(s);




        /*
        Why String Objects are given as immutable objects
An object can be referred by multiple reference variables in this case if
string objects are mutable objects, then we change the content of object
automatically other references get
also modified so that string objects are given as immutable objects it
means whenever any operation is done on strings it will create new object

         */
    }
}
