package decorator;

public class Caramel extends DecorateurIngredient{
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 0.22+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+", Caramel";
    }
}
