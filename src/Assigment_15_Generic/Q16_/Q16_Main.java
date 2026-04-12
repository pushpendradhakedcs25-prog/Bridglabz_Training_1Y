package Assigment_15_Generic.Q16_;

import java.util.*;

class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}

public class Q16_Main {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 = new Resume<>();
        r1.setRole(new SoftwareEngineer());

        Resume<DataScientist> r2 = new Resume<>();
        r2.setRole(new DataScientist());

        List<JobRole> list = new ArrayList<>();
        list.add(new SoftwareEngineer());
        list.add(new DataScientist());

        Resume.process(list);
    }
}