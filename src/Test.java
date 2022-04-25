import java.util.Scanner;

public class Test {
    public static void main(String arg1[]){
        System.out.println("args " +arg1[0]);
        System.out.println("args1 " +arg1[1]);
        System.out.println("Hello World!!!");
        Test.main();
        Test.accept();
        Scanner scanner = new Scanner(System.in);
        String s=  scanner.nextLine();
        int n =scanner.nextInt();
        System.out.println(s+"  "+n);
    }

    public static void main() {
        System.out.println("Hii");
    }

    static void accept(){
        System.out.println("Enter your details");
    }
}

/**
 * starting point for JVM to start execution of program
 * without main() JVM will not execute the program
 * public :  access modifier
 * static :  call the main() without creating an object.
 * void   :  main() does not return any thing/value
 * main() :  default signature which predefined in JVM
 * String args[] : accepts a group of strings so it is array
 *                  to accepts any type of data so it is String
 *                  to hold command line args
 *
 *
 * System  : public final class in java.lang package
 * out : instance of System class & is of PrintStream class
 *      when call the member a PrintStream class object creates internally
 * println() - method
 */