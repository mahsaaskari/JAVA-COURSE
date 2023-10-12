abstract class Vehicle {
    Engine engine;
    Manufacture manufacture;
    Car car;

    public Vehicle(Engine engine, Manufacture manufacture, Car car) {
        this.engine = engine;
        this.manufacture = manufacture;
        this.car = car;
    }
    public abstract void ShowCharacteristics();
}

class ICEV extends Vehicle {
    public ICEV(Engine engine, Manufacture manufacture, Car car) {
        super(engine, manufacture, car);
    }
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: ICEV");
        System.out.println("Engine Type: " + engine.type);
        System.out.println("Horsepower: " + engine.horsePower + " HP");
        System.out.println("Engine Displacement: " + engine.displacement + " cc");
        System.out.println("Manufacture: " + manufacture.getName());
        System.out.println("Manufacture Location: " + manufacture.getLocation());
        System.out.println("Founded Year: " + manufacture.getFoundedYear());

        // Display Car characteristics
        System.out.println("Car ID: " + car.id);
        System.out.println("Car Color: " + car.color);
        System.out.println("Car Price: " + car.price);
        System.out.println("Car Registration Number: " + car.registrationNumber);
    }
}

class BEV extends Vehicle {
    public BEV(Engine engine, Manufacture manufacture, Car car) {
        super(engine, manufacture, car);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: BEV");
        System.out.println("Engine Type: " + engine.type);
        System.out.println("Horsepower: " + engine.horsePower + " HP");
        System.out.println("Engine Displacement: " + engine.displacement + " cc");
        System.out.println("Manufacture: " + manufacture.getName());
        System.out.println("Manufacture Location: " + manufacture.getLocation());
        System.out.println("Founded Year: " + manufacture.getFoundedYear());

        // Display Car characteristics
        System.out.println("Car ID: " + car.id);
        System.out.println("Car Color: " + car.color);
        System.out.println("Car Price: " + car.price);
        System.out.println("Car Registration Number: " + car.registrationNumber);
    }
}

class HybridV extends Vehicle {
    public HybridV(Engine engine, Manufacture manufacture, Car car) {
        super(engine, manufacture, car);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: HybridV");
        System.out.println("Engine Type: " + engine.type);
        System.out.println("Horsepower: " + engine.horsePower + " HP");
        System.out.println("Engine Displacement: " + engine.displacement + " cc");
        System.out.println("Manufacture: " + manufacture.getName());
        System.out.println("Manufacture Location: " + manufacture.getLocation());
        System.out.println("Founded Year: " + manufacture.getFoundedYear());

        // Display Car characteristics
        System.out.println("Car ID: " + car.id);
        System.out.println("Car Color: " + car.color);
        System.out.println("Car Price: " + car.price);
        System.out.println("Car Registration Number: " + car.registrationNumber);
    }
}