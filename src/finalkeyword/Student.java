package finalkeyword;

public class Student {
    int id;
    String name;
    final String PAN_NO = "AHBH5829P";
    final String ADHAR_NO; //blank final variable
    final static String MOBILE_NO; //blank final variable
    Student(){
        ADHAR_NO = "98563147889933";
    }

    static {
        MOBILE_NO = "9866255555";
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.PAN_NO);
    }
}
