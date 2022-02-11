package stringdemo;

/**
 * String can be compared in 3 ways
 * 1. == operator - compares references(memory address)
 * 2. equals - compares the content of the strings & case sensitivity,does not ignore the case
 * 3. compareTo - compares the values lexicographically and returns an integer,
 *                 comparison is based on the Unicode value
 *                 0 -> same
 *                 1 or positive  -> first string is greater than second string
 *                -1 or negative -> first string is less than  second string
 * 4. equalsIgnoreCase - compares the content of the strings & ignores the cases
 */
public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Pune";
        String s2 = "Pune";
        String s3 = new String("Pune");
        String s4 = "PUNE";
        String s5 = "Amritsar";

        //== Operator
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false

        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
        System.out.println(s1.equalsIgnoreCase(s4)); //true

        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s5));//15
        System.out.println(s5.compareTo(s2));//-15

    }
}


