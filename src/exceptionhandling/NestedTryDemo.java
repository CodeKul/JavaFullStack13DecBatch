package exceptionhandling;

public class NestedTryDemo {
    public static void main(String[] args) {
        String str = null;
        try {
            try {
                System.out.println(20/0);
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
            System.out.println(str.length());
        }catch (Exception e){
            System.out.println("Parent Exception "+e.getMessage());
        }
        System.out.println("Remaining Code");
    }
}
