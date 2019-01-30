package factory;

public class TestComputer {
    public static void main(String[] args) {
       ComputerFactory comp = new ComputerFactory();
       Computer cp = comp.getInstance("PC");

       cp.getConfiguration();

        Computer cp1 = comp.getInstance("Server");
        cp1.getConfiguration();

    }

}
