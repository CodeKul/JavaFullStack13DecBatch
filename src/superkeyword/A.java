package superkeyword;

/**
 * 1. used to refer immediate parent class instance variable
 */
public class A {
    int a = 100;
}
class B extends A{
    int a = 80;
    void show(int a){
        System.out.println(a); // 50
        System.out.println(this.a); //80
        System.out.println(super.a); //100
    }

    public static void main(String[] args) {
        B b = new B();
        b.show(50);
    }
}
