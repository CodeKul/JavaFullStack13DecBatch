package innerclass;

public class AnonymousDemo {//parent  class
    void display(){
        System.out.println("in show method");
    }
}
class AnonymousTest{ // child class
   static AnonymousDemo demo = new AnonymousDemo() {
        void display(){
            super.display();
            System.out.println("in Anonymous test class display method");
        }
    };

    public static void main(String[] args) {
        demo.display();
    }
}

//class AnonymousImpl{
//    public static void main(String[] args) {
//        AnonymousDemo demo = new AnonymousDemo();
//        demo.display();
//    }
//}