package exceptionhandling;

public class ThrowsDemo1 {
    void m1() throws UserDefinedException{
        throw new UserDefinedException("Exception occur");
    }
    void m2() throws UserDefinedException{
        m1();
    }

    void m3(){
        try {
            m2();
        }catch (UserDefinedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ThrowsDemo1 throwsDemo1 = new ThrowsDemo1();
        throwsDemo1.m3();
    }
}

