package Mutithreading;
/*
1. Tasks might be very important
2. Tasks are independent of each other
3. A Multi-core CPU is sitting idle most of the time
4. A big task can be divided into smaller parts
5. Making your code responsive
 */
public class needOfThread {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        //first task
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d* ",i);

        }
        System.out.println("\n * task complete" );

        //second task
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d$ ",i);

        }
        System.out.println("\n $ task complete" );

        //third task
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d# ",i);

        }
        System.out.println("\n # task complete" );

        long endTime=System.currentTimeMillis();
        System.out.println("total time taken:"+(endTime-startTime));

    }
}
