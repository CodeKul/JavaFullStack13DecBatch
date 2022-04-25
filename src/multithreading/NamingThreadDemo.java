package multithreading;

public class NamingThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("current "+Thread.currentThread().getName());
        System.out.println("in running");
    }
}
class NamingThreadImpl{
    public static void main(String[] args) {
        NamingThreadDemo th1 = new NamingThreadDemo();
        NamingThreadDemo th2 = new NamingThreadDemo();
        System.out.println(th1.getName());
        System.out.println(th2.getName());
        th1.setName("Codekul");
        th2.setName("Codekul123");
        th1.start();
        th2.start();
        System.out.println(th1.getName());
        System.out.println(th2.getName());

    }
}
