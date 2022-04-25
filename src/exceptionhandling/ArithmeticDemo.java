package exceptionhandling;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int no1 = 100;
        int no2 = 0;
        try {
            System.out.println(no1/no2);
        }catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("User not supposed to divide no by 0");
            no2 = 5;
            System.out.println(no1/no2);
        }
        System.out.println("Remaining Code");
    }
}
