package Assigment_15_Generic.Q15_;

interface MealPlan {}

public class Meal<T extends MealPlan> {
    T plan;

    public void setPlan(T plan) {
        this.plan = plan;
    }
}