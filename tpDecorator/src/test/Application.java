package test;

import decorator.*;

public class Application {
    public static void main(String[] args) {
        Boisson b1=new Lait(new Chantilly(new Chocolat(new Sumatra())));
        System.out.println(b1.getDescription()+":\t € "+b1.cout());
        Boisson b2=new Chocolat(new Chocolat(new Caramel(new Colombia())));
        System.out.println(b2.getDescription()+":\t € "+b2.cout());
    }
}
