package Assigment_11;

class Person1 {
    String name;
}

class Teacher extends Person1 {
    void role() { System.out.println("Teacher"); }
}

class Student extends Person1 {
    void role() { System.out.println("Student"); }
}

class Staff extends Person1 {
    void role() { System.out.println("Staff"); }
}

public class Q9_SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.role();
    }
}