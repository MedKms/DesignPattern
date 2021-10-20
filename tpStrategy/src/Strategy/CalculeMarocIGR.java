package Strategy;

public class CalculeMarocIGR implements IEmployeeStrategy {
    @Override
    public float calculerIGR(float salaireMensuelBrut) {
        float salaireAnnuelBrut=salaireMensuelBrut*12;
        if(salaireAnnuelBrut <= 40000) return salaireAnnuelBrut*5/100;
        if(salaireAnnuelBrut > 40000 && salaireAnnuelBrut <= 120000) return salaireAnnuelBrut*20/100;
        if(salaireAnnuelBrut < 120000) return salaireAnnuelBrut*42/100;
        return  0;
    }
}
