package Assigment_9;

abstract class Vehicle {
    private double rate;

    public Vehicle(double rate) {
        this.rate = rate;
    }

    public double getRate() { return rate; }

    abstract double cost(int days);
}

interface Insurable {
    double insurance();
}

class Car extends Vehicle implements Insurable {
    public Car(double r) { super(r); }
    double cost(int d) { return getRate()*d; }
    public double insurance() { return 500; }
}

class Bike extends Vehicle {
    public Bike(double r) { super(r); }
    double cost(int d) { return getRate()*d; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(double r) { super(r); }
    double cost(int d) { return getRate()*d; }
    public double insurance() { return 1000; }
}

public class Q3_VehicleRental {
    public static void main(String[] args) {
        Vehicle v = new Car(1000);
        System.out.println(v.cost(5));
    }
}