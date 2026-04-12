package Assigment_15_Generic.Q14_;

import java.util.*;

abstract class CourseType {}

public class Course<T extends CourseType> {
    List<T> list = new ArrayList<>();

    public void add(T course) {
        list.add(course);
    }
}