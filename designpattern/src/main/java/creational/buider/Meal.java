package creational.buider;

public class Meal {
    public String getCurry() {
        return curry;
    }

    public String getColdDrink() {
        return coldDrink;
    }

    public String getBriyani() {
        return briyani;
    }

    private String curry;
    private String coldDrink;
    private String briyani;

    public void setCurry(String curry) {
        this.curry = curry;
    }

    public void setColdDrink(String coldDrink) {
        this.coldDrink = coldDrink;
    }

    public void setBriyani(String briyani) {
        this.briyani = briyani;
    }


}
