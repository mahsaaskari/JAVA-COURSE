class CarYearFinder {
    public static void main(String[] args) {
        // Create an array of Car objects
        Car[] cars = new Car[3];
        cars[0] = new Car(1, "Toyota", "Camry", 2020, "Silver", 25000.0, "XYZ123");
        cars[1] = new Car(2, "Honda", "Civic", 2019, "Red", 22000.0, "ABC456");
        cars[2] = new Car(3, "Ford", "F-150", 2018, "Blue", 35000.0, "DEF789");

        // Find and display cars of a given model that have been in use for more than n years
        String targetModel = "Civic";
        int n = 2; // Number of years

        System.out.println("List of " + targetModel + " cars used for more than " + n + " years:");
        for (Car car : cars) {
            if (car.model.equalsIgnoreCase(targetModel) && (2023 - car.yearOfManufacture > n)) {
                System.out.println(car.getDescription());
            }
        }
    }
}
