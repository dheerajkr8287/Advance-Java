package Typecasting;

public class typecasting {
    public static void main(String[] args) {
        //widening(implict) casting
        int num=10;
        System.out.println("the int value="+num);
        //convert from int to double
        double d=num;
        System.out.println("the double value:"+d);

        //narrowing(explict)
        double data=33.44;
        System.out.println("the double value:"+data);
        //converting double to int

        int intdata=(int)data;
        System.out.println("the int data:"+intdata);


    }
}
