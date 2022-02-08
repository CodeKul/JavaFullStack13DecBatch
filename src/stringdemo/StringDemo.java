package stringdemo;

public class StringDemo {
    public static void main(String[] args) {
        char[] ch = {'J', 'A', 'V', 'A'};
        String str1 = String.valueOf(ch);

        //String literal
        String str2 = "Java";

        //by new keyword
        String str3= new String("Java");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
