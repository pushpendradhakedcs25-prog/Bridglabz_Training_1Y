package Assigment_9;

abstract class Food {
    private double price;
    private int qty;

    public Food(double p,int q){
        price=p;
        qty=q;
    }

    public double getPrice(){ return price; }
    public int getQty(){ return qty; }

    abstract double total();
}

interface Discountable {
    double discount();
}

class Veg extends Food {
    public Veg(double p,int q){ super(p,q); }
    double total(){ return getPrice()*getQty(); }
}

class NonVeg extends Food implements Discountable {
    public NonVeg(double p,int q){ super(p,q); }
    double total(){ return getPrice()*getQty()+50; }
    public double discount(){ return 20; }
}

public class Q6_FoodDelivery {
    public static void main(String[] args) {
        Food f = new NonVeg(200,2);
        System.out.println(f.total());
    }
}