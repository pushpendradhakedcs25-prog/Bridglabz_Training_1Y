package Assigment_11;

interface Worker {
    void work();
}

class Person {
    String name;
}

class Chef extends Person implements Worker {
    public void work() { System.out.println("Cooking"); }
}

class Waiter extends Person implements Worker {
    public void work() { System.out.println("Serving"); }
}

public class Q10_RestaurantHybrid {
    public static void main(String[] args) {
        Worker w = new Chef();
        w.work();
    }
}