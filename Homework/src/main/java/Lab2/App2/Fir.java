package Lab2.App2;

import java.util.Observable;

public class Fir extends Observable implements Runnable {

    int id;
    Window win;
    int processorLoad;
    Thread thread;
    int cc;

    Fir(int id, int priority, Window win, int procLoad) {
        this.id = id;
        this.win = win;
        this.processorLoad = procLoad;
        this.thread=new Thread(this);
        this.thread.setPriority(priority);
    }

    public void run() {
        int c = 0;
        while (c < 1000)
        {
            for (int j = 0; j < this.processorLoad; j++)
            {
                j++;
                j--;
            }
            c++;
            this.setChanged();
            this.notifyObservers();

            this.cc=c;

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public int getId() {
        return id;
    }
    public int getCc() {
        return cc;
    }
}
