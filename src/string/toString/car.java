package string.toString;

public class car {
    int noOfwheel;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public car(int noOfDoors, int noOfwheel, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfDoors = noOfDoors;
        this.noOfwheel = noOfwheel;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

//    @Override
//    public String toString() {
//        return "my car name is:"+name;
//    }


    @Override
    public String toString() {
        return "car{" +
                "noOfwheel=" + noOfwheel +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        car swift=new car(4,4,200,"swift","SW123","maruti");
        System.out.println(swift.toString());
    }


}
