package Mutithreading.ThreadClass;

public class ExtendingTestThreadclass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        printTask t1 = new printTask('*');
        printTask t2 = new printTask('$');
        printTask t3 = new printTask('#');
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken: %d   ",
                Thread.currentThread().getName(),
                (endTime - startTime)," ");
    }




}
