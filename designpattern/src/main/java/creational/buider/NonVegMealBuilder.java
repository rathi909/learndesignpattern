package creational.buider;

public class NonVegMealBuilder implements MealBuilder{

    public NonVegMealBuilder(){
        meal = new Meal();
    }

    private Meal meal;
    @Override
    public void addCurry() {
        this.meal.setCurry("Potato");
    }

    @Override
    public void addColdDrink() {
      this.meal.setColdDrink("Pepsi");
    }

    @Override
    public void addBriyani() {
     this.meal.setBriyani("No veg");
    }

    @Override
    public Meal builds() {
        return meal;
    }
}
