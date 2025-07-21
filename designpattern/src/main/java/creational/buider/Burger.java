package creational.buider;

public class Burger {

    private String size;
    private boolean egg;
    private boolean onion;
    private boolean extraCheese;
    private Burger(Builder builder)
    {

    }



    public String getSize() {
        return size;
    }

    public boolean isEgg() {
        return egg;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public static class Builder {

        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        public Builder setEgg(boolean egg) {
            this.egg = egg;
            return this;
        }

        public Builder setOnion(boolean onion) {
            this.onion = onion;
            return this;
        }

        public Builder setExtraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        private String size;
        private boolean egg;
        private boolean onion;
        private boolean extraCheese;

        public Burger build(){
         return new Burger(this);
        }

    }
}
