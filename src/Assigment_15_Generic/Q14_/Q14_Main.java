package Assigment_15_Generic.Q14_;

class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}

public class Q14_Main {
    public static void main(String[] args) {

        Course<ExamCourse> c1 = new Course<>();
        c1.add(new ExamCourse());

        Course<AssignmentCourse> c2 = new Course<>();
        c2.add(new AssignmentCourse());

        System.out.println("Courses added successfully");
    }
}
