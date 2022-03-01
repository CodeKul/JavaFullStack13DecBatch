package multithreading;

public class ThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Current Thread "+Thread.currentThread().getName());
    }
}

class ThreadDemoImpl{
    public static void main(String[] args) {
        ThreadDemo th1 = new ThreadDemo(); //New(Born)
        th1.start(); // runnable
    }
}
