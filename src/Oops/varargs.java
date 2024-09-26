package Oops;

public class varargs {


//varagas:allow method to accept any number of arguments

    //here a,b are compulsory when method call
    public static void sum(int a,int b,int ...x){
        int res=a+b;
        for(int i=0;i<x.length;i++){
            res=res+x[i];
        }
        System.out.println(res);
    }
    public static void main(String... args) {
        sum(10,33);
        sum(10,10);
        sum(10,10,10,10,10);
    }
}
