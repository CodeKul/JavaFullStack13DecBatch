package controlflowstatement;

/**
 * - Exit control loop
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        int cnt = 1;
        do {
            System.out.println(cnt);
            cnt++;//2
        }while (cnt>=5);

        //infinite do-while
        do{
            System.out.println("infinite");
        }while (true);
    }
}
