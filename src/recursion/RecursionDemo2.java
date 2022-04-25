package recursion;

/**
 * add 1-5 nos
 */
public class RecursionDemo2 {
    public static void main(String[] args) {
        System.out.println(RecursionDemo2.add(5));
    }
    static int add(int no){
        if (no>0){
            return no + add(no-1);
        }
        return no;
    }
}
