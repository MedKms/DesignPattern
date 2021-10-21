package decorator;

public class Chantilly extends DecorateurIngredient{
    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 0.40+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+", Chantilly";
    }
}

