package collection;

//create a generic class
public class GenericsClass<T> {
    private T data;
    public GenericsClass(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

class GenericClassImpl{
    public static void main(String[] args) {
        GenericsClass<Integer> g1 = new GenericsClass<>(5);
        System.out.println(g1.getData());

        GenericsClass<String> g2 = new GenericsClass<>("This is generic class example");
        System.out.println(g2.getData());
    }
}