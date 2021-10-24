public  class Application {
    public static void main(String[] args) {
        DonneeMeteo dm=new DonneeMeteo();
        AffichageConditions ac=new AffichageConditions(dm);
        dm.setMesures(22,65,1020);
        dm.setMesures(25,75,1000);
        dm.setMesures(23,30,1800);
    }
}