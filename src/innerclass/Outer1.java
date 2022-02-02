package innerclass;
//Method Local Inner class
public class Outer1 {
    void outerMethod(){
        System.out.println("in outer method");
        class Inner{
            void  innerMethod(){
                System.out.println("in inner method");
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }
}
class Outer1Impl{
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        outer1.outerMethod();
    }
}
