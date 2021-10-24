import comp.File;
import comp.Folder;

public class Application {
    public static void main(String[] args) {
        Folder root=new Folder("Design Patterns");
        Folder d1=(Folder) root.addComponent(new Folder("Comportement"));
        Folder d2=(Folder) root.addComponent(new Folder("Structure"));
        Folder d3=(Folder) root.addComponent(new Folder("Création"));
        d1.addComponent(new File("Strategy"));
        d1.addComponent(new File("Observer"));
        d2.addComponent(new File("Decorator"));
        d2.addComponent(new File("Composite"));
        d2.addComponent(new File("Adapter"));
        d3.addComponent(new File("Singleton"));
        d3.addComponent(new File("Builder"));
        root.show();
    }
}
