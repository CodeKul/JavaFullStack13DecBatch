package stringdemo;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Codekul");
        System.out.println(stringBuffer);
        stringBuffer.append("PVT LTD.");
        System.out.println(stringBuffer);

        stringBuffer.insert(5,"****");
        System.out.println(stringBuffer);

        stringBuffer.deleteCharAt(4);
        System.out.println(stringBuffer);

        stringBuffer.delete(4,7);
        System.out.println(stringBuffer);

    }
}
