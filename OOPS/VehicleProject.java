// 10. 🔜 Mini Project: Vehicle System
// ➤ Abstract class Vehicle with methods like start() and fuelType().
// ➤ Subclasses: Car, Bike, Truck.
// ➤ Interface Electric with method chargeBattery().
// ➤ Store all in a Vehicle[] and demonstrate polymorphism.
package OOPS;

abstract class Vehicle{
    String model;
    String engine;
    
    void start(){
        System.out.println("vehicle Start");
    }
    void fuelType(){
        System.out.println("Defining fuel type");
    }
    void showDetails(){
        System.out.println("Model: "+ this.model);
        System.out.println("Engine: "+ this.engine);
    }
}
interface Electric{
    void chargeBattery();
}
class Car extends Vehicle implements Electric{
    String carType;
    Car(String model, String engine, String type){
        this.model = model;
        this.engine =engine;
        this.carType = type;
    }
    @Override
    void start(){
        System.out.println("Car Starts");
    }
    @Override
    void fuelType(){
        System.out.println("Diesel");
    }
    @Override
    public void chargeBattery(){
        System.out.println("Not supported");
    }
}
class Bike extends Vehicle implements Electric{
    String bikeType;
    Bike(String model, String engine, String type){
        this.model = model;
        this.engine =engine;
        this.bikeType = type;
    }
    @Override
    void start(){
        System.out.println("Bike Starts");
    }
    @Override
    void fuelType(){
        System.out.println("Petrol");
    }
    @Override
    public void chargeBattery(){
        System.out.println("Supported");
    }
}
class Truck extends Vehicle implements Electric{
    int wheels;
    Truck(String model, String engine, int wheels){
        this.model = model;
        this.engine =engine;
        this.wheels = wheels;
    }
    @Override
    void start(){
        System.out.println("Truck Starts");
    }
    @Override
    void fuelType(){
        System.out.println("Petrol");
    }
    @Override
    public void chargeBattery(){
        System.out.println("Not supported");
    }
}
public class VehicleProject {
    public static void main(String[] args) {
        Car car = new Car("tesla", "v8", "Sedan");
        Bike bike = new Bike("yamaha", "v2", "Sports");
        Truck truck = new Truck("tata", "v12", 18);
         

        car.showDetails();
        bike.showDetails();
        truck.showDetails();
    }
}
