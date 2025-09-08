package COLLECTIONS.Queue;


import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/*
=> Thread safe unbounded blocking queue
=> element can only be taken from the queue when its delay has expired
=> USEFUL  for scheduling tasks to be executed after a given delay
=> INTERNALLY implemented as a priority queue based on the delay time
=> elements must implement the Delayed interface which requires implementing getDelay() and compareTo() methods



What is DelayQueue?

A BlockingQueue implementation in java.util.concurrent.

Elements can only be taken when their delay has expired.

Internally backed by a PriorityQueue (ordered by delay time).

Used for scheduling tasks or handling time-based events.

🔹 Key Points

Elements must implement Delayed interface

Each element defines how much delay it has left.

Queue orders elements based on the remaining delay.

Blocking Behavior

take() waits until the head element’s delay has expired.

poll() returns element only if delay has expired, else null.

Unbounded Queue

Can grow as needed (memory is the limit).

Thread-Safe

Can be used by multiple producer/consumer threads.
 */
public class DelayQueueDemo {
    public static void main(String[] args) throws InterruptedException {

        DelayQueue<delayTask> delayQueue=new DelayQueue<>();
        delayQueue.put(new delayTask("Task1",5, TimeUnit.SECONDS));
        delayQueue.put(new delayTask("Task2",10, TimeUnit.SECONDS));
        delayQueue.put(new delayTask("Task3",3, TimeUnit.SECONDS));

        while(!delayQueue.isEmpty()){
            delayTask task=delayQueue.take();
            System.out.println("Executing "+ task.getTaskName()+" at "+System.currentTimeMillis());
        }
    }
}

class delayTask implements Delayed{

    private final String TaskName;
    private final long startTime;
    public delayTask(String taskName, long delay, TimeUnit unit) {
        this.TaskName = taskName;
        this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remaining=startTime-System.currentTimeMillis();
        return unit.convert(remaining,TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.startTime<((delayTask)o).startTime) return -1;
        if (this.startTime>((delayTask)o).startTime) return 1;
        return 0;
    }

    public String getTaskName() {
        return TaskName;
    }
}


/*
Real-World Use Cases

Task Scheduling

Execute tasks after a certain delay.

Example: reminder notifications, retries.

Caching Expiry

Store objects with expiry times.

When take() returns, it means cache entry expired → cleanup.

Rate Limiting

Control when tasks are available for processing.

Retry Mechanisms

If a task fails, reschedule it with a delay.

🔹 Important Notes

Backed internally by a PriorityQueue.

Fair ordering → tasks executed in order of delay.

Blocking nature ensures efficient waiting (no busy spin).
 */