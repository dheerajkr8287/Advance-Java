package test;
class MyDaemonThread extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Doeamon thread running"+Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
public class DaemonExample {
    public static void main(String[] args) {
        MyDaemonThread doemenThread=new MyDaemonThread();
        doemenThread.setDaemon(true);// Marking as daemon thread
        doemenThread.start();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread finsihed");
        MyDaemonThread doemenThread1=new MyDaemonThread();
        doemenThread1.setDaemon(true);

        doemenThread1.start();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("Main Thread finsihed");




    }
}


/*
Daemon Thread in Java (Simple Explanation)
A Daemon thread is a special type of thread in Java that runs in the background and automatically stops when all non-daemon (user) threads finish execution.

Key Points:
✅ Runs in the background (like Garbage Collector)
✅ Stops automatically when the main thread or other user threads finish
✅ Used for low-priority tasks (e.g., auto-saving, logging, garbage collection)

➡ Daemon thread stops after the main thread exits.

How to Create a Daemon Thread?
1️⃣ Create a normal thread
2️⃣ Call setDaemon(true) before starting the thread
3️⃣ Start the thread with start()

When to Use Daemon Threads?
🔹 Background tasks (e.g., logging, auto-save)
🔹 Garbage collection (JVM runs it as a daemon thread)
🔹 Notification services (checking for updates in the background)

When NOT to Use Daemon Threads?
❌ For critical tasks like writing to a file or database (since it may stop anytime!)

Key Differences: Daemon vs. User Thread
Feature	Daemon Thread	User Thread
Purpose	Background tasks	Main application logic
Stops when main thread ends?	✅ Yes	❌ No
Examples	Garbage Collector, Logging	Main application logic
Final Thoughts
Daemon threads are useful for background tasks but should not handle important operations.
Always set setDaemon(true) before starting a thread, otherwise, it will remain a user thread.
 */