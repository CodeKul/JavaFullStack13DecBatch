package polymorphism;

import java.io.Serializable;

public class PulsurImpl {
    public static void main(String[] args) {
        Bike bike = new Pulsur(); //upcasting
        bike.run();
        System.out.println(bike.speedLimit);//

    }
}
