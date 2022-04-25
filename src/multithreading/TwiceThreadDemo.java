package multithreading;

public class TwiceThreadDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
class TwiceThreadImpl{
    public static void main(String[] args) {
        TwiceThreadDemo th1 = new TwiceThreadDemo();
        Thread thread = new Thread(th1);
        thread.start();
        thread.start();// throw exception - IllegalThreadStateException
    }
}
