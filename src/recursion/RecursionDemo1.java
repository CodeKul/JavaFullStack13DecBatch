package recursion;

public class RecursionDemo1 {
    Integer no = 1;
    void show(){
        System.out.println("Hii "+no);
        while (no<5) {
            no++;
            show();
        }
    }

    public static void main(String[] args) {
        RecursionDemo1 demo1 = new RecursionDemo1();
        demo1.show();
    }
}
