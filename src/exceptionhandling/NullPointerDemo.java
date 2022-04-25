package exceptionhandling;

public class NullPointerDemo {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        System.out.println("Remaining COde");
    }
}
