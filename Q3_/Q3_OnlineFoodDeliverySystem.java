package Assigment_13.Q3_;


public class Q3_OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        Thread o1 = new Thread(new Order(1, 2));
        Thread o2 = new Thread(new Order(2, 3));
        Thread o3 = new Thread(new Order(3, 4));

        o1.setPriority(10);
        o2.setPriority(5);
        o3.setPriority(3);

        o1.start();
        o2.start();
        o3.start();
    }
}