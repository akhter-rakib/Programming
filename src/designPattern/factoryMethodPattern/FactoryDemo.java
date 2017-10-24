package designPattern.factoryMethodPattern;

public class FactoryDemo {
    public static void main(String[] args) {
        Computer Pc = ComputerFactory.getComputer("PC", "2GB", "500GB", "2.4");
        Computer server = ComputerFactory.getComputer("Server", "180GB", "1TB", "2.9GHz");
        System.out.println("Factory PC Configuration " + Pc);
        System.out.println("Factory Server Configaration " + server);

    }
}
