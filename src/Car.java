public class Car extends Vehicle {
    private double milesdriven;
    private double fuelconsumed;



    public Car(String make, String model, int year, double milesdriven, double fuelconsumed) {
        super(make, model, year);
        this.milesdriven = milesdriven;
        this.fuelconsumed = fuelconsumed;
    }

    @Override
    public double calculateFuelEfficiency() {
        double efficiency = milesdriven/fuelconsumed;
        return efficiency;
    }
    public void displayinfo() {
        super.displayinfo();
        System.out.println( milesdriven + fuelconsumed);
    }
}

