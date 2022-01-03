package polymorphism;

public class Bank {
    float getInterest(){
        return 0f;
    }
}

class HSBC extends Bank{
    float getInterest(){
        return 8.3f;
    }
}

class KotakMahindra extends Bank{
    float getInterest(){
        return 7.5f;
    }
}

class BankImpl {
    public static void main(String[] args) {
        Bank b; //reference variable of parent class
        b = new HSBC();
        System.out.println("HSBC Interest: "+b.getInterest());

        b = new KotakMahindra();
        System.out.println("KM Interest: "+b.getInterest());

    }
}