package by.stepanenko.itacademy.lesson19;

public class Bicycle extends Vehicle {
    private String bicycleType;

    public Bicycle(String vehicleType, int numberOfWheels, String bicycleType) {
        super(vehicleType, numberOfWheels);
        this.bicycleType = bicycleType;
    }

    public void displayBicycleInfo(){
        System.out.println("Vehicle type: " + this.vehicleType + "; number of wheels: " + numberOfWheels + "; bicycle type: " + bicycleType);
    }
}
