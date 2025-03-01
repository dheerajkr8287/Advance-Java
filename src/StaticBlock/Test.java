package StaticBlock;


 class student {
    //static variable
    public static int count=0;


    //static block during class load is execute
    static {
        System.out.println("hello kaka");
    }

    private int id;
    private  String name;
    private   int age;

    public student(){
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //static method
    public static  void getCount(){
        System.out.println("total student:"+count);
    }
}
public class Test {
    public static void main(String[] args) {
//        student student1=new student();
//        student student2=new student();
//        student student3=new student();
//        System.out.println(student.count);
        student.getCount();
    }
}
