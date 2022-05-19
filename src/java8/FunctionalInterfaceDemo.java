package java8;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void display(String str);
   // void display1(String str,Integer i,Float f);
    default void show(){

    }
}

class FunctionalInterfaceImpl{
    public static void main(String[] args) {
       // without lambda using anonymous class
//        FunctionalInterfaceDemo functionalInterface = new FunctionalInterfaceDemo() {
//            @Override
//            public void display(String str,Integer i,Float f) {
//                System.out.println("without lambda fun"+str);
//            }
//        };
//        functionalInterface.display("Java 8: ",1,10.5f);

        //with lambda
        FunctionalInterfaceDemo functionalInterface1 = (str) -> System.out.println(str +" with lambda fun");
        functionalInterface1.display("Java");


    }
}
