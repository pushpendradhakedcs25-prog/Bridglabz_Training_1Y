package Assigment_13.Q2_;

public class Q2_SmartHomeAutomation {
    public static void main(String[] args) {
        Thread temp = new Thread(new Device("Temperature", 5000));
        Thread cam = new Thread(new Device("Camera", 3000));
        Thread light = new Thread(new Device("Light", 4000));
        Thread door = new Thread(new Device("Door", 6000));

        cam.setPriority(10);
        temp.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);

        temp.start();
        cam.start();
        light.start();
        door.start();
    }
}