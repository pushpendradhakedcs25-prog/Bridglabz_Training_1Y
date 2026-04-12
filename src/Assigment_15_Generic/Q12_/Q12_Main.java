package Assigment_15_Generic.Q12_;

import java.util.*;

class Groceries extends WarehouseItem {}
class Furniture extends WarehouseItem {}

public class Q12_Main {
    public static void main(String[] args) {

        Storage<Electronics> s1 = new Storage<>();
        s1.add(new Electronics());

        List<Electronics> list = new ArrayList<>();
        list.add(new Electronics());

        Storage.display(list);
    }
}