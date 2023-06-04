package Lab4.App2;

public class Main{
    public static void main(String[] args)
    {
    Integer P9 = new Integer(1);
    Integer P10 = new Integer(1);
    new ExecutionThread(P9,P10, 2, 4,4,6, 4).start();
    new ExecutionThread(P10,P9, 3, 5, 5,7,5).start();
    }
}
