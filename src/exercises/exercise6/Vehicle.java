package exercises.exercise6;

public class Vehicle {
    public String manufacturer;

    public Vehicle(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
    public String toString() {
        return "Vehicle produced by "+manufacturer;
    }

    public static void main(String[] args) {

    }
}

class SpaceVehicle extends Vehicle {
    public String rocket_fuel_type;

    public SpaceVehicle(String rocket_fuel_type, String manufacturer) {
        super(manufacturer);
        this.rocket_fuel_type = rocket_fuel_type;
    }

    public String toString() {
        return "Vehicle produced by "+manufacturer+
                " fuel type is "+rocket_fuel_type;
    }
}

class LandVehicle extends Vehicle {
    String frameMaterial;

    public LandVehicle(String manufacturer) {
        super(manufacturer);
    }
}

class Rocket extends SpaceVehicle {
    String thrust;

    public Rocket(String rocket_fuel_type, String manufacturer) {
        super(rocket_fuel_type, manufacturer);
    }


    public String toString() {
        return "Vehicule produced by "+manufacturer+
                " fuel type is "+rocket_fuel_type+
                " thrust is "+thrust;
    }
}

class LandVehicleWithEngine extends  LandVehicle {
    String horsePower;

    public LandVehicleWithEngine(String manufacturer) {
        super(manufacturer);
    }
}

class LandVehicleWithoutEngine extends  LandVehicle {
    String powerSource;

    public LandVehicleWithoutEngine(String manufacturer) {
        super(manufacturer);
    }
}

class WheeledVehicle extends LandVehicleWithEngine {
    String wheelNumber;

    public WheeledVehicle(String manufacturer) {
        super(manufacturer);
    }
}

class TrackedVehicle extends LandVehicleWithEngine {
    String horsePower;

    public TrackedVehicle(String manufacturer) {
        super(manufacturer);
    }
}

class SailBoat extends LandVehicleWithoutEngine {
    String sailSurface;

    public SailBoat(String manufacturer) {
        super(manufacturer);
    }
}

class Car extends WheeledVehicle {
    String registrationNumber;

    public Car(String manufacturer) {
        super(manufacturer);
    }
}

class Tank extends TrackedVehicle {
    String armorThickness;

    public Tank(String manufacturer) {
        super(manufacturer);
    }
}