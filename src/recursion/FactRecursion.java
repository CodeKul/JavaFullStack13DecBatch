package recursion;

/**
 * 3! = 3 * 2 *1 = 6
 * 5! = 5 * 4 * 3 * 2 * 1 = 120
 */
public class FactRecursion {
    public static void main(String[] args) {
        System.out.println("Fact = " +FactRecursion.fact(5));

    }
    static int fact(int no){
        if (no>1){
            return no * fact(no - 1);
        }
        return no;
    }
}
