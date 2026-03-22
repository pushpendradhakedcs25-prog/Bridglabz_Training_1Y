package Assigment_11;

class Book {
    String title;
    int year;
}

class Author extends Book {
    String name;

    void display() {
        System.out.println(title + " " + year + " " + name);
    }
}

public class Q4_BookAuthor {
    public static void main(String[] args) {
        Author a = new Author();
        a.title="Java";
        a.year=2020;
        a.name="XYZ";
        a.display();
    }
}