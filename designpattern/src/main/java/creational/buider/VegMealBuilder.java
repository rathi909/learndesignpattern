package creational.buider;

public class VegMealBuilder implements MealBuilder{

    private Meal meal;

    public VegMealBuilder(){
        meal = new Meal();
    }
    @Override
    public void addCurry() {
     this.meal.setCurry("Cucumber curry");
    }

    @Override
    public void addColdDrink() {
     this.meal.setColdDrink("Coca cola");
    }

    @Override
    public void addBriyani() {
        this.meal.setBriyani("Veg");

    }

    @Override
    public Meal builds() {
        return meal;
    }
}
