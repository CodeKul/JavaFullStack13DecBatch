package exceptionhandling;

public class TryFinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }finally {
            System.out.println("I'm in finally block");
        }
        System.out.println("Remaining code");
    }
}
