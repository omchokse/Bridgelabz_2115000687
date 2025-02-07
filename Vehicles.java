class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println(maxSpeed + " km/h " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    Truck(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(int maxSpeed, String fuelType) {
        super(maxSpeed, fuelType);
    }
}

public class Vehicles {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(180, "Petrol", 5), new Truck(120, "Diesel"), new Motorcycle(220, "Petrol") };
        for (Vehicle v : vehicles)
            v.displayInfo();
    }
}
