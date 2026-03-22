package Assigment_10;

public class Q6_BackgroundJob {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Task Running");
        new Thread(r).start();
    }
}