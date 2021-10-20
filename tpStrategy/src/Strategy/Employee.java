package Strategy;

public class Employee {
    private String cin;
    private float salaireBrutMensuel;
    private IEmployeeStrategy employeeStrategy;
    public Employee() {
    }

    public Employee(String cin, float salaireBrutMensuel) {
        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;
    }
    public float calculerIGR(){
        float salaireBrutAnuel=salaireBrutMensuel*12;
        float taux=42;
        return employeeStrategy.calculerIGR(salaireBrutMensuel);
    }
    public float getSalaireNetMensuel(){
        float igr=calculerIGR();
        float salaireNetAnuel=salaireBrutMensuel*12-igr;
        return salaireNetAnuel/12;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public void setEmployeeStrategy(IEmployeeStrategy employeeStrategy) {
        this.employeeStrategy = employeeStrategy;
    }
}