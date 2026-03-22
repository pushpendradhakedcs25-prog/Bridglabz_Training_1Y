package Assigment_10;

interface Dashboard {
    void speed();

    default void battery() {
        System.out.println("Battery 80%");
    }
}

class ElectricCar implements Dashboard {
    public void speed() {
        System.out.println("Speed 60");
    }
}

public class Q12_VehicleDashboard {
    public static void main(String[] args) {
        Dashboard d = new ElectricCar();
        d.speed();
        d.battery();
    }
}