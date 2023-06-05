package Lab4.App4;

public class Notifier extends Thread{
    Integer monitor;
    Integer monitor1;
    int activity_min, activity_max;
    int timed;

    public Notifier(Integer monitor,Integer monitor1, int activity_min, int activity_max, int timed) {
        this.monitor = monitor;
        this.monitor1 = monitor1;
        this.activity_min = activity_min;
        this.activity_max = activity_max;
        this.timed=timed;
    }
    public void run() {

        System.out.println("monitor - STATE 1");

        try {
            Thread.sleep(500 * this.timed);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("monitor - STATE 2");
        int k = (int) Math.round(Math.random() * (activity_max - activity_min) + activity_min);
        for (int i = 0; i < k * 100000; i++) {
            i++;
            i--;
        }

        synchronized (monitor) {
            monitor.notify();
        }
        synchronized (monitor1) {
            monitor.notify();
        }

        System.out.println("monitor - STATE 3");


    }
}
