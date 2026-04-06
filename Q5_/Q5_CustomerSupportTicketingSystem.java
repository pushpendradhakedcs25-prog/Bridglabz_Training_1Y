package Assigment_13.Q5_;


public class Q5_CustomerSupportTicketingSystem {
    public static void main(String[] args) {
        Ticket t1 = new Ticket(1, "Critical");
        Ticket t2 = new Ticket(2, "Feature");
        Ticket t3 = new Ticket(3, "Query");
        Ticket t4 = new Ticket(4, "Feedback");

        t1.setPriority(10);
        t2.setPriority(4);
        t3.setPriority(2);
        t4.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}