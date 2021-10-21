package decorator;

public class Espresso extends Boisson{
    public Espresso() {
        description="Espresso";
    }

    @Override
    public double cout() {
        return 1.99;
    }
}
