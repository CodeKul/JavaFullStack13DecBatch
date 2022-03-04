package multithreading;

public class PriorityDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("in running state");
    }
}
class PriorityImpl{
    public static void main(String[] args) {
        PriorityDemo demo = new PriorityDemo();
        Thread th1 = new Thread(demo);
        Thread th2 = new Thread(demo);
        Thread th3 = new Thread(demo);

        System.out.println("Priority of 1 "+th1.getPriority());
        System.out.println("Priority of 2 "+th2.getPriority());
        System.out.println("Priority of 3 "+th3.getPriority());

        th1.setPriority(6);
        th2.setPriority(2);
        th3.setPriority(9);

        System.out.println("After setting Priority to thread 1 "+th1.getPriority());
        System.out.println("After setting Priority to thread 2 "+th2.getPriority());
        System.out.println("After setting Priority to thread 3 "+th3.getPriority());


    }
}