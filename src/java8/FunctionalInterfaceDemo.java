package java8;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void display(String str);
    default void show(){

    }
}

class FunctionalInterfaceImpl{
    public static void main(String[] args) {
        //without lambda using anonymous class
        FunctionalInterfaceDemo functionalInterface = new FunctionalInterfaceDemo() {
            @Override
            public void display(String str) {
                System.out.println("without lambda fun"+str);
            }
        };
        functionalInterface.display("Java 8: ");

        //with lambda
        FunctionalInterfaceDemo functionalInterface1 = (s) -> System.out.println(s+ " with lambda fun");
        functionalInterface1.display("JAVA 8");
    }
}
