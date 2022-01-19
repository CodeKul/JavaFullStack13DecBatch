package thiskeyword;

/**
 * 6. used to return current class instance
 */
public class P {
    P getP(){
        System.out.println("in p");
        return this;
    }
}

class Test{
    public static void main(String[] args) {
        P p = new P();
        p.getP();
    }
}
