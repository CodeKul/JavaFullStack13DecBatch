package java8;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void display(String str,Integer i,Float f);
    default void show(){

    }
}

class FunctionalInterfaceImpl{
    public static void main(String[] args) {
        //without lambda using anonymous class
//        FunctionalInterfaceDemo functionalInterface = new FunctionalInterfaceDemo() {
//            @Override
//            public void display(String str,Integer i) {
//                System.out.println("without lambda fun"+str);
//            }
//        };
//        functionalInterface.display("Java 8: ",1);

        //with lambda
        FunctionalInterfaceDemo functionalInterface1 = (s,i,f) -> System.out.println(s+ " with lambda fun");
        functionalInterface1.display("JAVA 8",1,1.5f);
    }
}
