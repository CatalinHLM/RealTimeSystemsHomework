package Lab3.Example3;

public class Main {
    static int sum=0;


    public static void main(String[] args){
        JoinTestThread w1 = new JoinTestThread("Thread 1",null,52654);
        JoinTestThread w2 = new JoinTestThread("Thread 2",w1,34006);
        w1.start();
        w2.start();

    }
}