package collection;

public class GenericMethod {
    public <T> void createGenericMethod(T data){
        System.out.println("In Generic method");
        System.out.println("Data "+data);
    }
}

class GenericMethodImpl{
    public static void main(String[] args) {
        GenericMethod gm1 = new GenericMethod();
        gm1.<Integer>createGenericMethod(25);

        gm1.<String>createGenericMethod("codekul");
    }
}