package Assigment_11;

class Device {
    int id;
    String status;
}

class Thermostat extends Device {
    int temp;

    void displayStatus() {
        System.out.println(id + " " + status + " " + temp);
    }
}

public class Q5_DeviceThermostat {
    public static void main(String[] args) {
        Thermostat t = new Thermostat();
        t.id=1;
        t.status="ON";
        t.temp=25;
        t.displayStatus();
    }
}