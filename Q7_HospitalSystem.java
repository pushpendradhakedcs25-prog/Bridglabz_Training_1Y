package Assigment_9;

abstract class Patient {
    abstract double bill();
}

interface Record {
    void add();
}

class InPatient extends Patient implements Record {
    double bill() { return 5000; }
    public void add() {}
}

class OutPatient extends Patient {
    double bill() { return 500; }
}

public class Q7_HospitalSystem {
    public static void main(String[] args) {
        Patient p = new InPatient();
        System.out.println(p.bill());
    }
}