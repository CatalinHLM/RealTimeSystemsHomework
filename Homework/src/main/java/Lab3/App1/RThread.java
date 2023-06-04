package Lab3.App1;

public class RThread extends Thread{
    FileService service;
    public RThread(FileService service) {
        this.service = service;
    }
    public void run(){
        while (!Main.isStopThreads()){
            try
            {
                synchronized (service) {
                    String readMsg = service.read();
                    System.out.println("RThread:" + readMsg);
                }
                Thread.sleep(3000);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}