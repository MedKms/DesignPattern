import java.util.ArrayList;
import java.util.List;

public class DonneeMeteo implements Sujet {
    private float temperature;
    private float humidite;
    private float pression;
    private List<Observateur> observateurs = new ArrayList();

    @Override
    public void enregisterObservateur(Observateur obs) {
        observateurs.add(obs);
    }

    @Override
    public void supprimerObservateur(Observateur obs) {
        int i = observateurs.indexOf(obs);
        if (i >= 0) {
            observateurs.remove(i);
        }
    }

    @Override
    public void notifierObservateurs() {
        for(int i=0;i<observateurs.size();i++){
            Observateur o=(Observateur)observateurs.get(i);
            o.actualiser(temperature,humidite,pression);
        }
    }
    public void setMesures(float t, float h, float p) {
        this.temperature=t;
        this.humidite=h;
        this.pression=p;
        actualiserMesures();
    }
    public void actualiserMesures() {
        notifierObservateurs();
    }

}
