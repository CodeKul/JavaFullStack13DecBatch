package innerclass;

// Static Nested class
class Outer2 {
   static void outerMethod() {
        System.out.println("inside outer class Method");
    }
    static class Inner2 {
         void display() {
            System.out.println("inside inner class Method");
            outerMethod();
        }
    }
}
class Outer2Impl {
    public static void main(String[] args) {
        Outer2.Inner2 obj = new Outer2.Inner2();
        obj.display();
    }
}