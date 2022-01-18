package thiskeyword;

/**
 * 2. used to invoke current class method(implicitly)
 */
public class X {
    void m1(){
        System.out.println("in m1");
    }
    void m2(){
        System.out.println("in m2");
        this.m1();
    }

    public static void main(String[] args) {
        X x = new X();
        x.m2();
    }
}
