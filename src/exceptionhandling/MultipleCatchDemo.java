package exceptionhandling;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        int no1 = 50;
        int no2 = 0;
        String s = null;
        int a[] = {1,2,3,4,5};
        try {
            System.out.println(a[10]);
            System.out.println(no1/no2);
            System.out.println(s.length());
        }
        catch (NullPointerException ne){
            System.out.println(ne);
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Remaining Code");
    }
}
