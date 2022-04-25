package multithreading;

public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("Current Thread "+Thread.currentThread().getName());
    }
}
class RunnableDemoImpl{
    public static void main(String[] args) {
        RunnableDemo demo = new RunnableDemo();
        Thread thread = new Thread(demo);
        thread.start();
    }
}