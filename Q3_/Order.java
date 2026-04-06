package Assigment_13.Q3_;


class Order implements Runnable {
    private int id;
    private int time;

    public Order(int id, int time) {
        this.id = id;
        this.time = time;
    }

    public void run() {
        System.out.println("Order " + id + " Picked Up");

        try {
            Thread.sleep(time * 1000);
        } catch (Exception e) {}

        System.out.println("Order " + id + " Delivered");
    }
}