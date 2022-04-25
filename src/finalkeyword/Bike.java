package finalkeyword;

public class Bike {
    final void run(){
        System.out.println("in Bike run method");
    }
}

class Suzuki extends Bike{
//    @Override   //compile time error
//    void run() {
//        System.out.println("in Suzuki run method");
//    }
}


