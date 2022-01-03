package methodoverloading;

public class Addition {
    int add(int a,int b){
        return a+b;
    }
//
//    float add(int a,int b){ //ambiguity
//        return a+b;
//    }


    int add(int a,int b,int c){
        return a+b+c;
    }

    float add(int a,float c){
        return a+c;
    }

    float add(float a,int c){
        return a+c;
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.add(10,10));
        System.out.println(addition.add(10f,10));
        System.out.println(addition.add(10,10f));
        System.out.println(addition.add(10,10,10));
    }
}
