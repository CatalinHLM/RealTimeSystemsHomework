package Lab4.App1;

public class Main {
    public static void main(String[] args) {
        Integer P9 = new Integer(1);
        Integer P10 = new Integer(1);

        new ExecutionThreadOne(P9,2, 4, 4).start();
        new ExecutionThread(P9, P10, 3, 6, 6).start();
        new ExecutionThreadOne(P10,2, 5, 5).start();
    }
}
