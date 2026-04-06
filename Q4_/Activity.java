package Assigment_13.Q4_;


class Activity implements Runnable {
    private String name;
    private int delay;

    public Activity(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }

    public void run() {
        try {
            Thread.sleep(delay);
            System.out.println(name + " started");
        } catch (Exception e) {}
    }
}
