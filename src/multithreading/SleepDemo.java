package multithreading;

public class SleepDemo extends Thread{
    @Override
    public void run() {
        for (int i = 1;i<=10;i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
class SleepDemoImpl{
    public static void main(String[] args) {
        SleepDemo demo = new SleepDemo();
        demo.start();
    }
}
