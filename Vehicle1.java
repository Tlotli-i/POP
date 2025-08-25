public class Vehicle1 {
     
    public static void main(String[] args) {
       Car car = new Car("BMW", 250, 100);
        Truck truck = new Truck("Scania", 300, 400);

        
        car.start();
        truck.start();

        
        car.displayInfo();
        System.out.println();
        truck.displayInfo();
        System.out.println();

        
        truck.loadCargo(5000);
        truck.loadCargo("Wool", 3000); 
    }
    
}
abstract class Vehicle {
    String brand;
    int speed;
    int fuelCapacity;

    
    public Vehicle(String brand, int speed, int fuelCapacity) {
        this.brand = brand;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

   
    abstract void start();

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}


class Car extends Vehicle {
    public Car(String brand, int speed, int fuelCapacity) {
        super(brand, speed, fuelCapacity);
    }

    @Override
    void start() {
        System.out.println("Car " + brand );
    }
}


class Truck extends Vehicle {
    public Truck(String brand, int speed, int fuelCapacity) {
        super(brand, speed, fuelCapacity);
    }

    @Override
    void start() {
        System.out.println("Truck " + brand );
    }

   
    public void loadCargo(int weight) {
        System.out.println("Loading cargo weighing " + weight + " kg.");
    }

  
    public void loadCargo(String cargoType, int weight) {
        System.out.println("Loading " + weight + " kg of " + cargoType + ".");
    }
}
