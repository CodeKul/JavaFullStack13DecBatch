package java8;

public interface I1 {
    void m1(String s);
    default void m2(String s){
        System.out.println(s);
    }
    static void  m3(String s){
        System.out.println(s);
    }
}

class TestInterface implements I1{

    @Override
    public void m1(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        TestInterface testInterface = new TestInterface();
        testInterface.m1("I'm abstract");
        testInterface.m2("I'm default");
        I1.m3("I'm static");
    }
}