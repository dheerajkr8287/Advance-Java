package Oops;

class jumgle{
   protected void makeNoise(){
        System.out.println("jungle sound");
    }
}

class cat extends jumgle{
   public void makeNoise(){
        System.out.println("moew");
    }
}
public class methodOverriding {
    public static void main(String[] args) {

        cat c=new cat();
        System.out.print("child obj:");
        c.makeNoise();
        jumgle j=new jumgle();
        System.out.print("parent obj:");

        j.makeNoise();

        //dynamic method dispatch and is used to achieve run time polymorphism
        // in java
//  reference(super)      object(sub)
        jumgle parent=new cat();
        parent.makeNoise();


//        cat c1=new jumgle();
//        c1.makeNoise();

    }

}
