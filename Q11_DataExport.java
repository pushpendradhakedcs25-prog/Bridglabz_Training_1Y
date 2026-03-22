package Assigment_10;

interface Export {
    void export();

    default void exportJSON() {
        System.out.println("Export JSON");
    }
}

class CSV implements Export {
    public void export() {
        System.out.println("Export CSV");
    }
}

public class Q11_DataExport {
    public static void main(String[] args) {
        Export e = new CSV();
        e.export();
        e.exportJSON();
    }
}