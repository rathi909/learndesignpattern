package creational.buider;

public class Main {
    public static void main(String[] args) {

        Burger burger = new Burger.Builder().setOnion(Boolean.FALSE).setExtraCheese(Boolean.TRUE).
                build();

        MealDirector mealDirector = new MealDirector(new NonVegMealBuilder());
        Meal meal = mealDirector.prepareMeal();
        System.out.println(meal.toString());

        MealDirector mealDirector1 = new MealDirector(new NonVegMealBuilder());
        Meal meal1 = mealDirector.prepareMeal();
        System.out.println(meal1.toString());


    }
}
