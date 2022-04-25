package multithreading;

class Table{
    synchronized void printTable(int n){ // for thread 2
        System.out.println("Table of "  +n);
        for (int i=1;i<=10;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadTable1 extends Thread{
    Table t ;
    ThreadTable1(Table t){
        this.t = t;
    }
    @Override
    public void run() {
            t.printTable(5);
    }
}
class ThreadTable2 extends Thread{
    Table t ;
    ThreadTable2(Table t){
        this.t = t;
    }
    @Override
    public void run() {
        t.printTable(11);
    }
}

public class SynchronisationDemoImpl1 {
    public static void main(String[] args) {
        Table table = new Table();
        ThreadTable1 th1 = new ThreadTable1(table);
        ThreadTable2 th2 = new ThreadTable2(table);
        th1.start();
        th2.start();
    }
}
