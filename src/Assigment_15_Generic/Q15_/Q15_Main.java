package Assigment_15_Generic.Q15_;

class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}

public class Q15_Main {
    public static void main(String[] args) {

        Meal<VegetarianMeal> m1 = new Meal<>();
        m1.setPlan(new VegetarianMeal());

        Meal<VeganMeal> m2 = new Meal<>();
        m2.setPlan(new VeganMeal());

        System.out.println("Meal plans created");
    }
}