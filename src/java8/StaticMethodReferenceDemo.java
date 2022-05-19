package java8;

/**
 * Here we defined a functional interface & referring a static method to it's
 * functional method
 */
@FunctionalInterface
interface Messageable{
    void msg();
}
public class StaticMethodReferenceDemo {
    public static void msgMe(){
        System.out.println("This is reference to a static method");
    }
    public static void main(String[] args) {
        Messageable messageable = StaticMethodReferenceDemo::msgMe;
        messageable.msg();
    }
}
