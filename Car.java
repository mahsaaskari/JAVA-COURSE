class Car {
    int id;
    String make, model, color, registrationNumber;
    int yearOfManufacture;
    double price;

    public Car(int id, String make, String model, int year, String color, double price, String regNumber) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.yearOfManufacture = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = regNumber;
    }

    public String getDescription() {
        return "Car ID: " + id +
                "\nMake: " + make +
                "\nModel: " + model +
                "\nYear: " + yearOfManufacture +
                "\nColor: " + color +
                "\nPrice: $" + price +
                "\nRegistration: " + registrationNumber + "\n";
    }

    public static void main(String[] args) {
        // Create an array of Car objects
        Car[] cars = new Car[3];

        // Populate the array with Car objects and display descriptions
        cars[0] = new Car(1, "Toyota", "Camry", 2020, "Silver", 25000.0, "XYZ123");
        cars[1] = new Car(2, "Honda", "Civic", 2019, "Red", 22000.0, "ABC456");
        cars[2] = new Car(3, "Ford", "F-150", 2022, "Blue", 35000.0, "DEF789");

        // Display the descriptions of the cars
        for (Car car : cars) {
            System.out.println(car.getDescription());
        }
    }
}