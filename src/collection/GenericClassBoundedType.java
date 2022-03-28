package collection;


public class GenericClassBoundedType<T extends Number> {
    void display(){
        System.out.println("This is a bounded type generics class");
    }

    public static void main(String[] args) {
        GenericClassBoundedType<Integer> gt1 = new GenericClassBoundedType();

    }
}
