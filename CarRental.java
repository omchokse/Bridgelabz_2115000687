class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    public void displayRentalDetails() {
        System.out.println("Customer: " + customerName + ", Car Model: " + carModel + ", Rental Days: " + rentalDays
                + ", Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Alice Johnson", "Toyota Corolla", 5);
        rental1.displayRentalDetails();
    }
}