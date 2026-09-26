package structural.adaptor.decorator;

public class BasicCoffe implements  Cofee{
    @Override
    public String description() {
        return "Simple cofee";
    }

    @Override
    public int cost() {
        return 50;
    }
}
