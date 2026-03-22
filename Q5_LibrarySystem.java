package Assigment_9;

abstract class Item {
    abstract int duration();
}

interface Reservable {
    void reserve();
}

class Book extends Item implements Reservable {
    int duration() { return 15; }
    public void reserve() {}
}

class Magazine extends Item {
    int duration() { return 7; }
}

class DVD extends Item {
    int duration() { return 5; }
}

public class Q5_LibrarySystem {
    public static void main(String[] args) {
        Item i = new Book();
        System.out.println(i.duration());
    }
}