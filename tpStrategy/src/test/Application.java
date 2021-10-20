package test;

import Strategy.Employee;
import Strategy.IEmployeeStrategy;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Employee employee = new Employee("VA137430",7000);
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Nom strategie:");
            String nomStrategie=sc.next();
            if(nomStrategie.equals("quit")) break;
            try {
                Class c = Class.forName(nomStrategie);
                IEmployeeStrategy strategy = (IEmployeeStrategy) c.newInstance();
                employee.setEmployeeStrategy(strategy);
                System.out.println(employee.calculerIGR());
            } catch (Exception e) {
                System.out.println(e);
            } }
    }
}
