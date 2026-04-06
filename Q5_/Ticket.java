package Assigment_13.Q5_;

class Ticket extends Thread {
    private int id;
    private String type;

    public Ticket(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public void run() {
        System.out.println("Processing Ticket " + id + " [" + type + "]");
        try {
            int t = (int)(Math.random() * 5 + 1);
            Thread.sleep(t * 1000);
        } catch (Exception e) {}

        System.out.println("Completed Ticket " + id);
    }
}
