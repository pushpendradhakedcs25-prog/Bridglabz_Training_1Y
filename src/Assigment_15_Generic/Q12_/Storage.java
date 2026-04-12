package Assigment_15_Generic.Q12_;

import java.util.*;

abstract class WarehouseItem {}

class Electronics extends WarehouseItem {}

public class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public static void display(List<? extends WarehouseItem> list) {
        System.out.println(list);
    }
}