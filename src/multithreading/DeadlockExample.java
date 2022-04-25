package multithreading;

public class DeadlockExample {
    public static void main(String[] args) {
        String res1 = "HP Petrol";
        String res2 = "Shell Petrol";
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                synchronized (res1){
                    System.out.println("Thread 1 locked resource 1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (res2){
                        System.out.println("Thread 1 locked resource 2");
                    }
                }
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                synchronized (res2){
                    System.out.println("Thread 2 locked resource 2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (res1){
                        System.out.println("Thread 2 locked resource 1");
                    }
                }
            }
        };

        thread1.start();
        thread2.start();
    }
}
