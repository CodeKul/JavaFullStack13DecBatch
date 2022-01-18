package association;

public class Vehicle {
    String vehicleType;
    int wheels;

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
class Car extends Vehicle{
    String carName;
    String color;
    Engine engine;
    MPlayer mPlayer;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public MPlayer getmPlayer() {
        return mPlayer;
    }

    public void setmPlayer(MPlayer mPlayer) {
        this.mPlayer = mPlayer;
    }
}
class Engine{
    int noOfCylinders;
    String fuelType;
    int stokes;

    public int getNoOfCylinders() {
        return noOfCylinders;
    }

    public void setNoOfCylinders(int noOfCylinders) {
        this.noOfCylinders = noOfCylinders;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getStokes() {
        return stokes;
    }

    public void setStokes(int stokes) {
        this.stokes = stokes;
    }
}
class MPlayer{
    int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
class VehicleImpl{
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setFuelType("Petrol");
        engine.setNoOfCylinders(2);
        engine.setStokes(6);

        MPlayer mPlayer = new MPlayer();
        mPlayer.setVolume(10);

        Car car = new Car();
        car.setCarName("MG-Hector");
        car.setWheels(4);
        car.setVehicleType("Car");
        car.setColor("White");
        car.setEngine(engine);
        car.setmPlayer(mPlayer);

        System.out.println("Name of Car "+car.getCarName());
        System.out.println("Vehicle Type "+car.getVehicleType());
    }
}
