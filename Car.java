public class Car {
    int id;
    String color, registrationNumber;
    double price;

    public Car(int id, String color, double price, String regNumber) {
        this.id = id;
        this.color = color;
        this.price = price;
        this.registrationNumber = regNumber;
    }
    public void ShowCharacteristics() {
        System.out.println("Car Characteristics:");
        System.out.println("ID: " + id);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Registration Number: " + registrationNumber);
    }
    public static void main(String[] args) {
        // Create car instances
        Car car1 = new Car(1, "Red", 25000.0, "ABC123");
        Car car2 = new Car(2, "Blue", 30000.0, "XYZ789");
        Car car3 = new Car(3, "Silver", 20000.0, "DEF456");

        // Create engines
        Engine engine1 = new CombustionEngine("Gasoline", 200, 2000);
        Engine engine2 = new ElectricEngine("Electric", 150, 0);
        Engine engine3 = new HybridEngine("Gasoline/Electric", 180, 1800);

        // Create manufacturers
        Manufacture manufacture1 = new Manufacture("Toyota", "Japan", 1890);
        Manufacture manufacture2 = new Manufacture("Tesla", "USA", 1920);
        Manufacture manufacture3 = new Manufacture("Honda", "Japan", 2020);

        // Create Vehicles
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new ICEV(engine1, manufacture1, car1);
        vehicles[1] = new BEV(engine2, manufacture2, car2);
        vehicles[2] = new HybridV(engine3, manufacture3, car3);

        // Display the characteristics of the vehicles and cars
        for (Vehicle vehicle : vehicles) {
            vehicle.ShowCharacteristics();
        }
    }
}