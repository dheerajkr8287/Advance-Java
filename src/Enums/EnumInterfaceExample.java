package Enums;
//Enums can implement interfaces but cannot extend classes (because they already extend java.lang.Enum).

interface Printable{
    void print();
}

enum status implements Printable{
    SUCCESS,FAILURE,PENDING;
    @Override
    public void print() {
        System.out.println("Current Status:"+this);
    }
}
public class EnumInterfaceExample {
    public static void main(String[] args) {
        status success = status.SUCCESS;
        success.print();
    }
}
