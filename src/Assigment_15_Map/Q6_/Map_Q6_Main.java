package Assigment_15_Map.Q6_;

import java.util.*;

public class Map_Q6_Main {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("A", 0);
        students.put("B", 0);
        students.put("C", 0);

        Map_Q6_Attendance.markAttendance(students, Arrays.asList("A", "B"));
        Map_Q6_Attendance.markAttendance(students, Arrays.asList("A"));

        Map_Q6_Attendance.showLowAttendance(students, 2);
    }
}