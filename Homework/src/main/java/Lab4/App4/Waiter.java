package Lab4.App4;

public class Waiter extends Thread{
    Integer monitor;
    int activity_min, activity_max;
    int timed;

    Thread thread;

    public Waiter(Integer monitor, int activity_min, int activity_max, Thread thread) {
        this.monitor = monitor;
        this.activity_min = activity_min;
        this.activity_max = activity_max;
        this.timed=timed;
        this.thread=thread;
    }
    public void run() {
        System.out.println(this.getName() + " - STATE 1");

        synchronized (monitor) {
            try {
                monitor.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(this.getName() + " - STATE 2");
        int k = (int) Math.round(Math.random()*(activity_max - activity_min) + activity_min);
        for (int i = 0; i < k * 100000; i++)
        {
            i++; i--;
        }

        System.out.println(this.getName() + " - STATE 3");


        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
