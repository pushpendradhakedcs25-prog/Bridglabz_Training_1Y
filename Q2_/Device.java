package Assigment_13.Q2_;

class Device implements Runnable {
    private String name;
    private int interval;

    public Device(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " cycle " + i);
            try {
                Thread.sleep(interval);
            } catch (Exception e) {}
        }
    }
}
