package thiskeyword;

/**
 *  4. used to pass as an argument in the method
 */
public class A {
    void m1(A a){
        System.out.println("method m1 is invoked");
    }
    void m2(){
         m1(this);
    }

    public static void main(String[] args) {
        A a = new A();
        a.m2();
    }
}
