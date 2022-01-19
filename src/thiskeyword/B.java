package thiskeyword;

/**
 * 5. used to pass as an argument in constructor call
 */
public class B {
    int i = 9;
    B(A1 a1){
        System.out.println("in class B constructor");
    }
}
class A1 {
    int i = 10;
    A1(){
        B b = new B(this);
    }

    public static void main(String[] args) {
        A1 a = new A1();
    }
}
