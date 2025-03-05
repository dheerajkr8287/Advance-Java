package Generic.GenericContructor;

public class Box2 {
    //generic constructor
    public <T extends  Number>Box2(T value){

    }

    //generic method
    public static <T> void display(T element){
        System.out.println("generic Display:"+element);
    }
    public static <T> void display(Integer element){
        System.out.println("generic Display:"+element);
    }

    public  <T> void  printArrray(T[] array){
        for (T element:array){
            System.out.println(element+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Box2 box2=new Box2(2);

        Integer[]  array={1,2,4,5,6};
        String[]  strings={"hello","world"};
        box2.printArrray(array);
        box2.printArrray(strings);

        display(44);
        display(44.4);




    }
}
