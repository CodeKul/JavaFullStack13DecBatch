package java8;

public interface LambdaExpressionDemo {
    void add(Integer a1,Integer a2);
}

class LambdaExprImpl{
    public static void main(String[] args) {
        //without lambda
//        LambdaExpressionDemo lam = new LambdaExpressionDemo() {
//            @Override
//            public void add(Integer a1, Integer a2) {
//                System.out.println(a1+a2);
//            }
//        };
//        lam.add(10,20);

        LambdaExpressionDemo lam1 = (a1,a2) -> System.out.println(a1+a2);
        lam1.add(10,20);
    }
}