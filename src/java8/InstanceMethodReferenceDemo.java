package java8;
@FunctionalInterface

interface Messageable1{
    void msg();
}
public class InstanceMethodReferenceDemo {
    public void msgMe(){
        System.out.println("This is reference to a instance method");
    }
    public static void main(String[] args) {
        InstanceMethodReferenceDemo instanceMethod = new InstanceMethodReferenceDemo();
        Messageable1 messageable1 = instanceMethod::msgMe;
       // Messageable1 messageable1 = new InstanceMethodReferenceDemo()::msgMe;
        messageable1.msg();
    }
}
