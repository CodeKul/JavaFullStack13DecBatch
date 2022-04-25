package stringdemo;

public class StringImmutableDemo {
    public static void main(String[] args) {
        String s1 = "Mumbai";
        String s2 = "Mumbai";
        s1 = "Pune";
        s1.concat(",India");
        System.out.println(s1); //Pune

        String s3 = s2.concat(",India");
        System.out.println(s3);

    }
}
