package Loop;

public class breaks {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
                System.out.println("i="+i);
            if(i==5){
                break;
            }

        }
        System.out.println("end loop");
    }
}
