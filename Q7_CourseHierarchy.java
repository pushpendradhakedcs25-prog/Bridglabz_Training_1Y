package Assigment_11;

class Course {
    String name;
}

class OnlineCourse extends Course {
    String platform;
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
}

public class Q7_CourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse c = new PaidOnlineCourse();
        c.name="Java";
        c.platform="Udemy";
        c.fee=1000;
        System.out.println(c.name + " " + c.platform + " " + c.fee);
    }
}