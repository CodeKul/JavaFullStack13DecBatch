package multithreading;

class CounterTest{
    void countIncrement(){ //t1
        System.out.println("Welcome");
        System.out.println("Welcome");
        System.out.println("Welcome");
        System.out.println("Welcome");
        System.out.println("Welcome");
        System.out.println("Welcome");
        System.out.println("Welcome");
        System.out.println("Welcome");
        System.out.println("Welcome");

        synchronized (this) {
            for (int i = 0; i < 25; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Bye");
        System.out.println("Bye");
        System.out.println("Bye");
        System.out.println("Bye");
        System.out.println("Bye");
        System.out.println("Bye");


    }
}
class MyThread1 extends Thread{
    CounterTest counterTest;
    MyThread1(CounterTest counterTest){
        this.counterTest = counterTest;
    }
    @Override
    public void run() {
        counterTest.countIncrement();
    }
}

public class SynchronisedBlockImpl {
    public static void main(String[] args) {
        CounterTest counterTest = new CounterTest();
        MyThread1 th1 = new MyThread1(counterTest);
        MyThread1 th2 = new MyThread1(counterTest);
        th1.start();
        th2.start();
    }
}
