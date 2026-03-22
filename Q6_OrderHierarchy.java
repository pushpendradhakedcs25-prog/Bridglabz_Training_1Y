package Assigment_11;

class Order {
    int id;
}

class ShippedOrder extends Order {
    String tracking;
}

class DeliveredOrder extends ShippedOrder {
    String date;

    void status() {
        System.out.println("Delivered");
    }
}

public class Q6_OrderHierarchy {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder();
        d.status();
    }
}