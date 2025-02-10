abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate: " + ratePerKm);
    }
}

class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return ratePerKm * distance * 0.8;
    }
}

interface GPS {
    String getCurrentLocation();

    void updateLocation(String newLocation);
}

class RideHailingTest {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C101", "Alice", 10);
        Vehicle v2 = new Bike("B202", "Bob", 5);

        v1.getVehicleDetails();
        System.out.println("Fare for 10 km: " + v1.calculateFare(10));

        v2.getVehicleDetails();
        System.out.println("Fare for 10 km: " + v2.calculateFare(10));
    }
}