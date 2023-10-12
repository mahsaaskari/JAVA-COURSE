class Engine {
    String type;//the engine type (e.g., gasoline or diesel)
    int horsePower;//engine's horsepower rating
    double displacement;//engine displacement (in cc or L)

    public Engine(String type, int horsePower, double displacement) {
        this.type = type;
        this.horsePower = horsePower;
        this.displacement = displacement;
    }
}

class CombustionEngine extends Engine {
    public CombustionEngine(String type, int horsePower, double displacement) {
        super(type, horsePower, displacement); // Call the constructor of the parent class to initialize inherited properties.
    }
}

class ElectricEngine extends Engine {
    public ElectricEngine(String type, int horsePower, double displacement) {
        super(type, horsePower, displacement); // Call the constructor of the parent class to initialize inherited properties.
    }
}

class HybridEngine extends Engine {
    public HybridEngine(String type, int horsePower, double displacement) {
        super(type, horsePower, displacement); // Call the constructor of the parent class to initialize inherited properties.
    }
}
