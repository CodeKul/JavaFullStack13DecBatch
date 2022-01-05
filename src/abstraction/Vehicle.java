package abstraction;

public abstract class Vehicle {
    Vehicle(){
        System.out.println("Vehicle is created");
    }
    static void show(){
        System.out.println("in static method");
    }
    final void stop(){
        System.out.println("in final method");
    }

    abstract void start(); //abstract method with no method body
    void display(){ //non-abstract method or concrete method
        System.out.println("in display");
    }
}
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("start with key...");
    }
}
class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("start with button...");
    }
}
class VehicleImpl{
    public static void main(String[] args) {
        Vehicle vehicle;//reference object
        vehicle = new Car();
        vehicle.start();
        vehicle.display();

        vehicle = new Bike();
        vehicle.start();
    }
}