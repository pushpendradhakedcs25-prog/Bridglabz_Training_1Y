package Assigment_11;

interface Refuelable {
    void refuel();
}

class Vehicle1 {
    int speed;
}

class ElectricVehicle extends Vehicle1 {
    void charge() { System.out.println("Charging"); }
}

class PetrolVehicle extends Vehicle1 implements Refuelable {
    public void refuel() { System.out.println("Refueling"); }
}

public class Q11_VehicleHybrid {
    public static void main(String[] args) {
        PetrolVehicle p = new PetrolVehicle();
        p.refuel();
    }
}