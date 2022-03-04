package multithreading;

public class DaemonThreadDemo extends Thread{
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()){
            System.out.println(Thread.currentThread().getName() +" Daemon Thread");
        }else
        System.out.println(Thread.currentThread().getName() +" User Thread");
    }
}
class DaemonThreadImpl{
    public static void main(String[] args) {
        DaemonThreadDemo th1 = new DaemonThreadDemo();
        DaemonThreadDemo th2 = new DaemonThreadDemo();
        DaemonThreadDemo th3 = new DaemonThreadDemo();
        th1.start();

        th2.setDaemon(true);
        th2.start();
        th3.start();
    }
}
