package exception_handling;

public class try_catch {
    public static  void m1(){
        System.out.println("hello m1 ");

        m2();
        System.out.println("bye m1 ");

    }
    public static  void m2(){
        System.out.println("hello m2 ");
         try {
             System.out.println("JAb tak exception nhi ata try mai bhi line run hoga");
             System.out.println(10 / 0);
             System.out.println("In try block");
         }catch(Exception e){
             System.out.println("In catch");
             e.printStackTrace();//line+description+exception name
             //e.toString();
            // System.out.println(e.toString());//exception name+descrption
             //e.getMessage();//description
             // System.out.println(e.getMessage());


         }
        System.out.println("bye m2");


    }
    public static void main(String[] args) {
          m1();
    }


}
