package Assigment_10;

interface Marker {}

class Data implements Marker {}

public class Q13_Serialization {
    public static void main(String[] args) {
        Data d = new Data();
        if(d instanceof Marker)
            System.out.println("Backup Allowed");
    }
}