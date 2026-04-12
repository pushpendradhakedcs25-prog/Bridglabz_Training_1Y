package Assigment_15_Generic.Q5_;

public class Q5_Main {
    public static void main(String[] args) {
        Q5_FruitBox<Apple> box=new Q5_FruitBox<>();
        box.add(new Apple());
        box.show();
    }
}