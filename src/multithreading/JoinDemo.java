package multithreading;

public class JoinDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Thread started " +Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread Terminated "+Thread.currentThread().getName());
    }
}
class JoinDemoImpl {
    public static void main(String[] args) throws InterruptedException{
        JoinDemo th1 = new JoinDemo();
        JoinDemo th2 = new JoinDemo();
        JoinDemo th3 = new JoinDemo();
            //main thread will pause
        th1.start();
        th1.join();
        th2.start();
        th2.join();
        th3.start();
        th3.join();
        System.out.println("All threads are completes its executions");
    }
}
