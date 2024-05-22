public class Track extends Vehicle {
    private double milesdriven;
    private double fuelConsumed;
    private double cargoWeight;

    public Track(String make, String model, int year, double milesdriven, double fuelConsumed, double cargoWeight) {
        super(make, model, year);
        this.milesdriven = milesdriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double calculateFuelEfficiency() {
        double efficiency = milesdriven/fuelConsumed;
        return efficiency;
    }
    public void displayinfo() {
        super.displayinfo();
        System.out.println( milesdriven + fuelConsumed + cargoWeight);
    }
}
