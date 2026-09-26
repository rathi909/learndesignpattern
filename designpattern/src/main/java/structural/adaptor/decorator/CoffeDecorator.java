package structural.adaptor.decorator;

public abstract class CoffeDecorator implements Cofee{

    protected Cofee cofee;

    public CoffeDecorator(Cofee cofee){
        this.cofee = cofee;
    }


}
