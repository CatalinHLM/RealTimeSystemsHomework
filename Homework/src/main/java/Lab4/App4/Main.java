package Lab4.App4;

public class Main {
    public static void main(String[] args) {

        Integer P8 = 1;
        Integer P9 = 1;
        Notifier notifier=new Notifier(P8,P9,2, 3, 7);
        Waiter waiter1=new Waiter(P8, 3, 6, notifier);
        Waiter waiter2=new Waiter(P9,2, 5, waiter1);

        notifier.start();
        waiter1.start();
        waiter2.start();

    }
}
