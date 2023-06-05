package Lab4.App3;

public class Main {
    public static void main(String[] args) {
        Integer P8 = new Integer(1);;

        new ExecutionThread(P8,3, 6, 5).start();
        new ExecutionThread(P8, 4, 7, 3).start();
        new ExecutionThread(P8,5, 7, 6).start();
    }
}
