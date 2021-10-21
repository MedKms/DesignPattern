package decorator;

public class Chocolat extends DecorateurIngredient{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 0.20+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+", Chocolat";
    }
}
