package creational.buider;

public class MealDirector {

    private MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder){
        this.mealBuilder = mealBuilder;
    }

    public Meal prepareMeal(){
        mealBuilder.addBriyani();
        mealBuilder.addColdDrink();
        mealBuilder.addCurry();
        return mealBuilder.builds();
    }


}
