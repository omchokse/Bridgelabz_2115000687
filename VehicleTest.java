abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out
                .println("Vehicle: " + vehicleNumber + ", Type: " + type + ", Rental Cost: " + calculateRentalCost(1));
    }
}

class Car extends Vehicle {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days * 0.8;
    }
}

interface Insurable {
    double calculateInsurance();

    String getInsuranceDetails();
}

class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Car("123ABC", 1000);
        Vehicle v2 = new Bike("456XYZ", 500);
        v1.displayDetails();
        v2.displayDetails();
    }
}
