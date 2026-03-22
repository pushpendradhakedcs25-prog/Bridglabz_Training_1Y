package Assigment_11;

class Animal {
    String name;
    int age;

    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}

class Bird extends Animal {
    void makeSound() {
        System.out.println("Chirp");
    }
}

public class Q1_AnimalHierarchy {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();
    }
}