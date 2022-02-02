package innerclass;
//Nested Inner class
public class Outer { //Outer.class
    void show(){
        System.out.println("in show method");
    }
    class Inner{ //Outer$Inner.class
        void display(){
            System.out.println("in display method");
        }
        static void m1(){
            System.out.println("in m1 ");
        }

    }
}
class OuterImpl{    //OuterImpl.class
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();

       Outer.Inner inner = outer.new Inner();
        inner.display();

        Outer.Inner.m1();
    }
}
