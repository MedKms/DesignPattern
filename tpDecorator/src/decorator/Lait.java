package decorator;

public class Lait extends DecorateurIngredient{
    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 0.30+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+", Lait";
    }
}
