package Lab4.App2;

public class ExecutionThread extends Thread {
    Integer monitor1,monitor2;
    int activity_min, activity_max, activity_min2, activity_max2, timed;

    public ExecutionThread(Integer monitor1,Integer monitor2, int activity_min, int activity_max, int activity_min2, int activity_max2, int timed) {
        this.monitor1 = monitor1;
        this.monitor2 = monitor2;
        this.activity_min = activity_min;
        this.activity_max = activity_max;
        this.activity_min2 = activity_min2;
        this.activity_max2 = activity_max2;
        this.timed=timed;
    }
    public void run() {
        System.out.println(this.getName() + " - STATE 1");
        int k = (int) Math.round(Math.random()*(activity_max - activity_min) + activity_min);
        for (int i = 0; i < k * 100000; i++)
        {
            i++; i--;
        }

        synchronized (monitor1) {
            synchronized (monitor2){
            System.out.println(this.getName() + " - STATE 2");
            k = (int) Math.round(Math.random()*(activity_max2 - activity_min2) + activity_min2);
            for (int i = 0; i < k * 100000; i++)
            {
                i++; i--;
            }


                System.out.println(this.getName() + " - STATE 3");

                try
                {
                    Thread.sleep(500*this.timed);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
        System.out.println(this.getName() + " - STATE 4");
    }


}