package by.stepanenko.itacademy.lesson19;

public class Vehicle {
    String vehicleType;
    int numberOfWheels;

    public Vehicle(String vehicleType, int numberOfWheels){
        this.vehicleType = vehicleType;
        this.numberOfWheels = numberOfWheels;
    }

    public void displayInfo(){
        System.out.println("Vehicle type: " + vehicleType + "; number of wheels: " + numberOfWheels);
    }
}
