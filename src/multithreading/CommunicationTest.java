package multithreading;

public class CommunicationTest {
    Integer i;
    boolean bufferFullFlag = false;
    synchronized void produce(int i){
        if (bufferFullFlag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.i = i;
        bufferFullFlag = true;
        System.out.println("Data produced: "+i);
        notify();
    }
   synchronized int consume(){
        if (!bufferFullFlag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Data consumed "+i);
        bufferFullFlag = false;
        notify();
        return i;
    }
}

class Producer extends Thread{
    CommunicationTest test;

    Producer(CommunicationTest test){
        this.test = test;
    }

    @Override
    public void run() {
        for (int j=1;j<=5;j++){
            test.produce(j);
        }
    }
}

class Consumer extends Thread{
    CommunicationTest test;
    Consumer(CommunicationTest test){
        this.test = test;
    }

    @Override
    public void run() {
        for (int k=0;k<=5;k++){
            test.consume();
        }
    }
}

class CommunicationImpl{
    public static void main(String[] args) {
        CommunicationTest test = new CommunicationTest();
        Producer producer = new Producer(test);
        Consumer consumer = new Consumer(test);
        producer.start();
        consumer.start();
    }
}