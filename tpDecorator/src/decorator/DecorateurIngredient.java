package decorator;

public abstract class DecorateurIngredient extends Boisson{
    protected Boisson boisson;
    public abstract String getDescription();
    public DecorateurIngredient(Boisson boisson){
        this.boisson=boisson;
    }
}
