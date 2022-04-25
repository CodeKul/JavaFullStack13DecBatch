package stringdemo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Pune");
        stringBuilder.append(",Maharashtra");
        System.out.println(stringBuilder);

        stringBuilder.insert(0,"**");
        System.out.println(stringBuilder);

        stringBuilder.delete(0,2);
        System.out.println(stringBuilder);

        stringBuilder.deleteCharAt(4);
        System.out.println(stringBuilder);
    }
}
