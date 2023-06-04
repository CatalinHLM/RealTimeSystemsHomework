package Lab3.Example3;

class JoinTestThread extends Thread{
    Thread t;
    int nr;
    JoinTestThread(String n, Thread t){
        this.setName(n);
        this.t=t;
    }
    JoinTestThread(String n, Thread t, int nr){
        this.setName(n);
        this.t=t;
        this.nr=nr;
    }
    public void run() {
        System.out.println("Thread "+this.getName()+" has entered the run() method");
        try {
            if (t != null) t.join();
            System.out.println("Thread "+this.getName()+" executing operation.");
            Thread.sleep(2000);
            dividers(this.nr);
            System.out.println("Thread "+this.getName()+" has terminated operation.");
        }
        catch(Exception e){e.printStackTrace();}
    }

    public void dividers(int nr){
        int d=2;
        int sum=0;
        while(d*d<nr){
            if(nr%d==0)
            {
                System.out.println(d+ " " + nr/d +" ");
                sum=sum+d+nr/d;
            }
            d++;
        }
        Main.sum=Main.sum+sum;
        System.out.println("Sum after thread "+ this.getName() + ": " +Main.sum);
    }

}