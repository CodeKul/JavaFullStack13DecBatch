package superkeyword;

/**
 * 2. used to invoke parent class method
 */
public class Vehicle {
    void v1(){
        System.out.println("I'm in Vehicle class");
    }
}
class Bike extends Vehicle{
    void b1(){
        super.v1();
        System.out.println("I'm in Bike class");
    }
}
class VehicleImpl{
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.b1();
    }
}
