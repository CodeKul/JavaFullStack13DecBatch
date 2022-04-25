package multithreading;

import java.util.concurrent.*;

class Task implements Runnable{
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Long duration = (long)(Math.random() * 10);
        System.out.println("Executing "+name);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        for (int i=1;i<=5;i++){
            Task task = new Task("Task "+ i);
            System.out.println("Created "+task.getName());
            executor.execute(task);
        }
        executor.shutdown();

    }
}
