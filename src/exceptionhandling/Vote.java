package exceptionhandling;

public class Vote {
    public static void main(String[] args) {
        Vote vote = new Vote();
        vote.checkAgeCriteria(17);
        System.out.println("Remaining Code");
    }

    void checkAgeCriteria(int age) {
        if (age < 18) {
            throw new ArithmeticException("You are not eligible for voting");
        } else {
            System.out.println("You are eligible for vote");
        }
    }
}
