class CarPriceFinder {
    public static void main(String[] args) {
       
        Car[] cars = new Car[3];
        cars[0] = new Car(1, "Toyota", "Camry", 2020, "Silver", 25000.0, "XYZ123");
        cars[1] = new Car(2, "Honda", "Civic", 2019, "Red", 22000.0, "ABC456");
        cars[2] = new Car(3, "Ford", "F-150", 2022, "Blue", 35000.0, "DEF789");


        // Find and display cars of a given year of manufacture with a price higher than the specified one
        int targetYear = 2020;
        double targetPrice = 24000.0;

        System.out.println("List of cars manufactured in " + targetYear + " with a price higher than $" + targetPrice + ":");
        for (Car car : cars) {
            if (car.yearOfManufacture == targetYear && car.price > targetPrice) {
                System.out.println(car.getDescription());
            }
        }
    }
}
