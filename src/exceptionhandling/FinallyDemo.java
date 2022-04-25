package exceptionhandling;

public class FinallyDemo {
    public static void main(String[] args) {
        int no1 = 50;
        int no2 = 0;
        try {
            System.out.println(no1/no2);
        }
        catch (ArithmeticException e){
            System.out.println("in catch block "+e.getMessage());
        }
        finally {
            System.out.println("I'm in finally block");
        }
        System.out.println("Remaining code");
    }
}
