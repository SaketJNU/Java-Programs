// Abstract class Vehicle
abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method
    public abstract void startEngine();
}

// Interface FuelType
interface FuelType {
    void fuelEfficiency();  // No body since it's an interface method
}

// Car class extending Vehicle and implementing FuelType
class Car extends Vehicle implements FuelType {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " Car engine started with key ignition.");
    }

    @Override
    public void fuelEfficiency() {
        System.out.println(brand + " Car has fuel efficiency of 15 km/l.");
    }
}

// Bike class extending Vehicle and implementing FuelType
class Bike extends Vehicle implements FuelType {

    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " Bike engine started with kick start.");
    }

    @Override
    public void fuelEfficiency() {
        System.out.println(brand + " Bike has fuel efficiency of 45 km/l.");
    }
}

// Main class to test the implementation
public class VehicleTest {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        Bike myBike = new Bike("Honda");

        System.out.println("--- Car ---");
        myCar.startEngine();
        myCar.fuelEfficiency();

        System.out.println("\n--- Bike ---");
        myBike.startEngine();
        myBike.fuelEfficiency();
    }
}

