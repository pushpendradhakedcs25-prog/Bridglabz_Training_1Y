package Assigment_10;

interface Converter {
    static double kmToMiles(double km) {
        return km * 0.621;
    }
}

public class Q8_UnitConversion {
    public static void main(String[] args) {
        System.out.println(Converter.kmToMiles(10));
    }
}