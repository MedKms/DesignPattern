package decorator;

public class Sumatra extends Boisson{

    @Override
    public double cout() {
        return 3.99;
    }
    public Sumatra() {
        description="Sumatra";
    }
}
