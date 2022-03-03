package multithreading;

public class RunMethodDemo extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread is running");
    }
}
class RunMethodImpl{
    public static void main(String[] args) {
        RunMethodDemo demo = new RunMethodDemo();
        demo.run();
    }
}
