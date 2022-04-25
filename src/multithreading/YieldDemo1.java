package multithreading;

public class YieldDemo1 extends Thread{
    @Override
    public void run() {
        for (int i = 1;i<=50;i++){
            Thread.yield();
            System.out.println("Thread one is running");
        }
    }
}
 class YieldDemo2 extends Thread{
    @Override
    public void run() {
        for (int i = 1;i<=5;i++){
            System.out.println("Thread two is running");
        }
    }
}


class YieldDemoImpl{
    public static void main(String[] args) {
        YieldDemo1 th1  = new YieldDemo1();
        YieldDemo2 th2 = new YieldDemo2();
        th1.start();
        th2.start();
    }
}
