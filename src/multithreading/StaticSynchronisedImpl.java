package multithreading;

class CounterTest1 {
    static synchronized void countIncrement() { //t1\
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread1 extends Thread {
    CounterTest1 counterTest;
    Thread1(CounterTest1 counterTest) {
        this.counterTest = counterTest;
    }

    @Override
    public void run() {
        counterTest.countIncrement();
    }
}

class Thread2 extends Thread {
    CounterTest1 counterTest;

    Thread2(CounterTest1 counterTest) {
        this.counterTest = counterTest;
    }

    @Override
    public void run() {
        counterTest.countIncrement();
    }
}

public class StaticSynchronisedImpl {
    public static void main(String[] args) {
        CounterTest1 counterTest = new CounterTest1();
        Thread1 th1 = new Thread1(counterTest);
        Thread2 th2 = new Thread2(counterTest);
        th1.start();
        th2.start();
        CounterTest1 counterTest2 = new CounterTest1();
        Thread1 th3 = new Thread1(counterTest2);
        Thread2 th4 = new Thread2(counterTest2);
        th3.start();
        th4.start();

    }
}
