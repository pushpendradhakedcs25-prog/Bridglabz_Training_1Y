package Assigment_13.Q4_;


public class Q4_UniversityExamHallManagement {
    public static void main(String[] args) {
        Thread entry = new Thread(new Activity("Entry", 0));
        Thread paper = new Thread(new Activity("Paper", 5000));
        Thread attendance = new Thread(new Activity("Attendance", 10000));
        Thread collection = new Thread(new Activity("Collection", 15000));

        paper.setPriority(10);
        attendance.setPriority(8);
        collection.setPriority(7);
        entry.setPriority(5);

        entry.start();
        paper.start();
        attendance.start();
        collection.start();
    }
}