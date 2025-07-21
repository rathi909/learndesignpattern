package creational.buider;

public interface MealBuilder {
    public abstract void addCurry();
    public abstract void addColdDrink();
    public abstract void addBriyani();
    public abstract Meal builds();

}
