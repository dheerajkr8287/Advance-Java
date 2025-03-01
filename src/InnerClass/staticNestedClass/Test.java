package InnerClass.staticNestedClass;

public class Test {
    public static void main(String[] args) {
        Computer computer=new Computer("hp","AB","xyz");
        Computer.getOs().displayInfo();

        Computer.USB usb=new Computer.USB("type-c");
        Computer.USB usb1=new Computer.USB("Type_B");
        usb1.displayInfo();

    }
}
