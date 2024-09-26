package Oops;

class test{
    test(){
        System.out.println("main test contructor hu..");
    }
    
}
class demo extends test{
    int a ;
    demo(){
        //consturctor ki first statement super,this mai se kio ek  hoti hai
//        super();//calling parent class constructor

        this(10);/// Calls the parameterized constructor
        System.out.println("child.......");
   }

    public demo(int i){
        super();

        System.out.println("with parameter contructor..");
    }
}

public class Constructor {
    public static void main(String[] args) {
       demo d=new demo();
    }
}
