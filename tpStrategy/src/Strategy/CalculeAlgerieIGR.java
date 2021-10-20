package Strategy;

public class CalculeAlgerieIGR implements IEmployeeStrategy{
    @Override
    public float calculerIGR(float salaireMensuelBrut) {
        float salaireAnnuelBrut = salaireMensuelBrut * 12;
        return salaireAnnuelBrut * 35 /100;
    }
}
