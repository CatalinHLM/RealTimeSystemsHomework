package Lab2.App2;

public class Main {

    private static final int noOfThreads=10;

    private static final int processorLoad=1000000;

    public static void main(String args[]){

        Window win=new Window(noOfThreads);
        Fir f;

        for(int i =0; i<noOfThreads; i++){
            f=new Fir(i,i+2,win,processorLoad);
            f.addObserver(win);
            f.thread.start();
        }

    }

}