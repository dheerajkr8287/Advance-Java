package InnerClass.staticNestedClass;

public class Computer {
    private String brand;
    private String model;



    private static operatingSystem os;
    static  class USB{
        private  String type;
        public USB(String type) {
            this.type = type;
        }
        public  void displayInfo(){
            System.out.println("USB type :"+type);
        }




    }

    public static operatingSystem getOs() {
        return os;
    }
    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new operatingSystem(osName);
    }

    class operatingSystem{
        private  String osName;

        public operatingSystem(String osName) {
            this.osName = osName;
        }
        public void displayInfo(){
            System.out.println("computer Model:"+model+",OS:"+osName);
        }


    }
}
