package Assigment_11;

class Vehicle {
    int maxSpeed;
    String fuelType;

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType);
    }
}

class Car extends Vehicle {
    int seats;
}

class Truck extends Vehicle {
    int load;
}

class Motorcycle extends Vehicle {
    int cc;
}

public class Q3_VehicleHierarchy {
    public static void main(String[] args) {
        Vehicle[] v = {new Car(), new Truck(), new Motorcycle()};
        for(Vehicle x : v)
            x.displayInfo();
    }
}