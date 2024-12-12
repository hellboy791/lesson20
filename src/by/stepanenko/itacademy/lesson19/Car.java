package by.stepanenko.itacademy.lesson19;

public class Car extends Vehicle {
    private String carBrand;

    public Car(String vehicleType, int numberOfWheels, String carBrand) {
        super(vehicleType, numberOfWheels);
        this.carBrand = carBrand;
    }

    public void displayCarInfo(){
        System.out.println("Vehicle type: " + this.vehicleType + "; number of wheels: " + numberOfWheels + "; car brand: " + carBrand);
    }
}
