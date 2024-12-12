package by.stepanenko.itacademy.lesson19;

import java.util.ArrayList;

public class Transportation {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Bicycle("Bicycle", 2, "SomeBike1"));
        vehicles.add(new Car("Car", 4, "Renault"));
        vehicles.add(new Bicycle("Bicycle", 3, "Bike3"));
        vehicles.add(new Car("Car", 4, "KIA"));
        vehicles.add(new Car("Car", 4, "Nissan"));

        for (Vehicle vehicle: vehicles){
            if (vehicle instanceof Car){
                ((Car) vehicle).displayCarInfo();
            } else if(vehicle instanceof Bicycle){
                ((Bicycle) vehicle).displayBicycleInfo();
            }
        }
    }
}
